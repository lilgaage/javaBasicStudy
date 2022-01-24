package MoreThread.ThreadState;

public class Blocked {
    /**
     * BLOCKED锁阻塞：
     * 一个正在阻塞等待一个监视器锁（锁对象）的线程处于这一状态。
     *
     * 比如线程A与线程B代码中使用同一锁，如果线程A获取到锁，线程A进入到Runnable状态，
     * 那么线程B就进入到BLOCKED锁阻塞状态。
     * 这是由Runnable状态进入到Blocked状态。
     * 除此之外Waiting以及TimedWaiting状态也会在某种情况下进入阻塞状态，
     *
     */
}
