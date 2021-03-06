package MoreThread.ThreadSafe.ThreadSynchronization;

public class Define {
    /**
     * 当使用多个线程访问同一资源的时候，且多个线程中对资源有写的操作，就容易出现线程安全问题。
     * 要解决上述多线程并发访问同一个资源的安全性问题：也就是解决重复票与不存在票的问题，
     * java中提供了同步机制synchronized来解决。
     *
     * 根据案例简述：窗口1线程进入操作时，窗口2和窗口3的线程只能在外等着，窗口1操作结束，
     * 窗口1、窗口2、窗口3才有机会进入代码去执行。也就是说在某个线程修改共享资源的时候，
     * 其他线程不能修改该资源，等待修改完毕同步之后，才能去抢夺cpu资源，完成对应的操作，
     * 保证了数据的同步性，解决了线程不安全的现象。
     *
     * 为了保证每个线程都能正常执行原子操作，java引入了线程同步机制。
     * 1.同步代码块
     * 2.同步方法
     * 3.锁机制
     */
}
