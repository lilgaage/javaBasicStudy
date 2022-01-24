package MoreThread.ThreadState;

public class Define {
    /**
     * 当线程被创建并启动以后，既不是一启动就进入了执行状态，也不是一直处于执行状态。
     * 在线程的生命周期中，有六种线程状态：
     *
     *       线程状态                      导致状态发生条件
     *       NEW新建          线程刚被创建，但未启动。还没调用start()
     *    Runnable可运行      线程可以在java虚拟机中运行的状态，可能正在运行自己的代码，也可能没有，取决于操作系统处理器
     *    Blocked锁阻塞       当一个线程试图获取一个对象锁，而该对象锁被其他的线程持有，则该线程进入Blocked状态；
     *                       当该线程持有锁时，该线程将变成Runaable状态
     *    Waiting无限等待      一个线程在等待另一个线程执行一个（唤醒）动作时，该线程进入Waiting状态。
     *                       进入这个状态后是不能自动唤醒的，必须等待另一个线程调用notify或notifyAll方法才能唤醒
     * Timed Waiting计时等待   同Waiting状态，有几个方法有超时参数，调用他们将进入Timed Waiting状态。
     *                       这一状态将一直保持到超时期满或接收到唤醒通知。
     *                        带有超时参数的常用方法有Thread.sleep\Object.wait
     *    Teminated被终止       因为run方法正常退出而死亡，或者因为没有捕获的异常终止了run方法而死亡
     *
     *  不需要知道实现原理，只需知道线程操作中存在这样的状态。
     */
}
