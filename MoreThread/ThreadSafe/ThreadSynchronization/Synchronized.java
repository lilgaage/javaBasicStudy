package MoreThread.ThreadSafe.ThreadSynchronization;

public class Synchronized implements Runnable{
    /**
     * 同步代码块
     * synchronized关键字可以用于方法中的某个区块中，表示只对这个区块的资源实现互斥访问。
     * 格式：
     *  sunchronized(同步锁) {
     *      需要同步操作的代码
     *  }
     *
     *  同步锁：对象的同步锁只是一个概念，可以想象为在对象上标记了一个锁
     *  1.锁对象 可以是任意类型
     *  2.多个线程对象 要使用同一把锁
     *  注意：在任何时候，最多允许一个线程拥有同步锁，谁拿到锁就进入代码块，其他线程只能在外等着（BLOCKED）
     */
    private int ticket = 100;
    Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        // TODO Auto‐generated catch block
                        e.printStackTrace();
                    }
                    // 获取当前线程对象名字
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "正在卖：" + ticket--);
                }
            }
        }
    }

    public static void main(String[] args) {
        // 线程任务对象
        Synchronized ticket = new Synchronized();

        Thread thread1 = new Thread(ticket, "窗口1");
        Thread thread2 = new Thread(ticket, "窗口2");
        Thread thread3 = new Thread(ticket, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    } // 使用同步代码块后，上述线程的安全问题就解决了，没有卖重复的票，也没有不存在的票
}
