package MoreThread.ThreadSafe.ThreadSynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockUse implements Runnable{
    /**
     * java.util.concurrent.locks.Lock机制提供了比synchronized代码块和synchronized方法更广泛的锁定操作，
     * 同步代码块/同步方法具有的功能Lock都有，除此之外更强大，更体现面向对象
     * Lock锁也叫同步锁，加锁与释放锁方法化了，如下：
     *  public void lock():加同步锁
     *  public void unlock:释放同步锁
     */
    private int ticket = 100;
    // 在成员位置创建一个ReentrantLock对象
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock(); // 加锁
            if (ticket > 0) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    // TODO Auto‐generated catch block
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖：" + ticket--);
            }
            lock.unlock(); // 放锁
        }
    }

    public static void main(String[] args) {
        LockUse ticket = new LockUse();
        Thread thread1 = new Thread(ticket, "窗口1");
        Thread thread2 = new Thread(ticket, "窗口2");
        Thread thread3 = new Thread(ticket, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
