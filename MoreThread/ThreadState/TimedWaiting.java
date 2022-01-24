package MoreThread.ThreadState;

public class TimedWaiting extends Thread{
    /**
     * Timed Waiting：
     * 一个正在限时等待另一个线程执行一个（唤醒）动作的线程处于这一状态。
     *
     * 在写卖票的案例这种，为了减少线程执行太快，现象不明显等问题，在run方法中添加了sleep，
     * 这样就强制当前正在执行的线程休眠（暂停执行），以“减慢线程”。
     * 当调用了sleep后，当前执行的线程就进入到“休眠状态”，其实就是所谓的TimedWaiting（计时等待）
     */

    // 实现一个计数器，计数到100，在每个数字之间暂停1秒，每隔10个数字输出一个字符串

    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if (i % 10 == 0) {
                System.out.println("------" + i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new TimedWaiting().start();
    }
    /**
     * 通过案例可以发现，sleep方法的使用还是很简单的，只需记住下面几点：
     *  1.进入TIMED_WAITING状态的一种常见情形是调用的sleep方法，单独的线程也可以调用，不一定非要有协作关系
     *  2.为了让其他线程有机会执行，可以将Thread.aleep()的调用放线程run()之内。
     *      这样才能保证该线程执行过程中会睡眠。
     *  3.sleep与锁无关，线程睡眠到期自动苏醒，并返回到Runnable（可运行）状态
     *  tips：sleep()中指定的时间是线程不会运行的最短时间。因此sleep不能保证该线程睡到到期后就立刻开始执行。
     *
     */
}
