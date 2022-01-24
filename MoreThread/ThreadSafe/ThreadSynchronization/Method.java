package MoreThread.ThreadSafe.ThreadSynchronization;

public class Method implements Runnable{
    /**
     * 同步方法
     * 使用synchronized修饰的方法，保证A线程执行该方法时，其他线程只能在方法外等着。
     * 格式：
     *  public synchronized void method() {
     *      可能会产生线程安全问题的代码
     *  }
     *
     *  同步锁是谁？
     *  对于非static方法，同步锁就是this
     *  对于static方法，使用当前所在类的字节码对象（类名.class）
     */
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            sellTicket();
        }

    }

    /**
     * 锁对象 谁调用这个方法就是谁
     *  隐含 锁对象就是this
     */
    public synchronized void sellTicket() {
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
    }

    public static void main(String[] args) {
        Method ticket = new Method();
        Thread thread1 = new Thread(ticket, "窗口1");
        Thread thread2 = new Thread(ticket, "窗口2");
        Thread thread3 = new Thread(ticket, "窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
