package MoreThread.ThreadSafe;

public class ThreadSafe implements Runnable{
    /**
     *  线程安全
     *  如果有多个线程在同时运行，而这些线程可能会同时运行这段代码。程序每次运行结果和单线程运行的结果是一样的，
     *  而且其他的变量的值也和预期是一样的，就是线程安全的。
     *
     *  例如电影票要卖票，假设要播放的电影是复联4，本次电影的座位共100个（本场电影只能卖100个）
     *  实现多个窗口同时卖复联4这场电影票（多个窗口一起卖这100张票）。
     *  需要窗口，采用线程对象来模拟；需要票，Runnable接口子类来模拟。
     */

    private int ticket = 100;
    // 卖票
    @Override
    public void run() {
        // 每个窗口卖票的动作
        // 窗口永远开启
        while (true) {
            if (ticket > 0) { // 有票，可以卖
                // 出票操作
                // 使用sleep模拟一下出票时间
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                // 获取当前线程对象的名字
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖：" + ticket--);
            }
        }
    }

    public static void main(String[] args) {
        // 创建线程任务对象
        ThreadSafe ticket = new ThreadSafe();
        // 创建三个窗口对象
        Thread t1 = new Thread(ticket, "窗口1");
        Thread t2 = new Thread(ticket, "窗口2");
        Thread t3 = new Thread(ticket, "窗口3");
        // 同时卖票
        t1.start();
        t2.start();
        t3.start();
        /**
         * 运行结果：
         * ......
         * 窗口3正在卖：5
         * 窗口1正在卖：4
         * 窗口2正在卖：5
         * 窗口1正在卖：3
         * 窗口2正在卖：2
         * 窗口3正在卖：2
         * 窗口1正在卖：1
         * 窗口3正在卖：0
         * 窗口2正在卖：-1
         */
        // 发现，相同的票数被卖了多次；不存在的票0、-1也被卖了
        // 这种问题说明线程票数不同步，称为线程不安全。
        // 线程安全问题都是由全局变量及静态变量引起的。若每个线程对全局变量、静态变量只有读操作，
        // 而无写操作，一般来说，这个全局变量是线程安全的；若有多个线程同时执行写操作，
        // 一般都需要考虑线程同步，否则的话就可能影响线程安全。
    }
}
