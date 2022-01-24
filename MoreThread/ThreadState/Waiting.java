package MoreThread.ThreadState;

public class Waiting {
    /**
     * Waiting无限等待：
     * 一个正在无限期等待另一个线程执行一个特别的（唤醒）动作的线程处于这一状态。
     */
    public static Object obj = new Object(); // 创建锁对象，保证唯一

    public static void main(String[] args) {
        new Thread(new Runnable() { // 创建一个顾客线程（消费者）
            @Override
            public void run() {
                while (true) { // 一直等着买包子
                    synchronized (obj) { // 保证唤醒和等待只有一个线程在执行，使用同步技术
                        try {
                            System.out.println(Thread.currentThread().getName() +
                                    "===获取到锁对象，调用wait方法，进入waiting状态，释放锁对象-----顾客1告知老板要买的包子和数量");
                            obj.wait(); // 调用wait方法，放弃cpu的执行，进入到waiting状态
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 唤醒之后执行
                        System.out.println(Thread.currentThread().getName() +
                                "===从waiting状态醒来，获取到锁对象，继续执行了-----顾客1的包子做好了，可以吃了");
                    }
                }
            }
        }, "等待线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        try {
                            System.out.println(Thread.currentThread().getName() + "-----顾客2告知老板要买的包子和数量");
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "-----顾客2的包子做好了，可以吃了");
                    }
                }
            }
        }, "等待线程").start();

        new Thread(new Runnable() { // 创建一个老板线程（生产者）
            @Override
            public void run() {
                while (true) { // 一直做包子
                    try {
                        System.out.println(Thread.currentThread().getName() + "===等待3秒");
                        Thread.sleep(3000); // 花了三秒做包子
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) { // 保证等待和唤醒只有一个线程执行，使用同步技术
                        System.out.println(Thread.currentThread().getName() +
                                "===获取到锁对象，调用notify方法，释放锁对象");
//                        obj.notify(); // 如果多个线程，随机唤醒一个   做好包子后，调用notify方法，唤醒顾客吃包子
                        obj.notifyAll(); // 唤醒所有等待线程
                    }
                }
            }
        }, "唤醒线程").start();
    }
    /**
     * 一个调用了某个对象的Object.wait方法的线程会等待另一个线程调用此对象的Object.notify()或Object.notifyAll()
     * 其实waiting状态并不是一个线程的操作，它体现的是多个线程间的通信，可以理解为多个线程之间的协作关系，
     * 多个线程会争取锁，同时相互之间又存在协作关系。比如同事之间晋升时存在竞争，但更多时候是一起完成某些任务。
     *
     * 当多个线程协作时，比如A、B线程。
     * 如果A线程在Runnable状态中调用了wait()方法，那么线程A就进入了waiting状态，同时失去了同步锁。
     * 假如这个时候B线程获取到了同步锁，在运行状态中调用了notify()方法，那么就会将五险等待的A线程唤醒。
     * 注意是唤醒，如果获取到了锁对象，那么A线程唤醒后就进入了Runnable状态；
     * 如果没有获取到锁对象，那么就进入到Blocked状态。
     */

    /**
     * 在翻阅API的时候发现计时等待与无限等待状态练习很紧密，
     * 比如无限等待状态中wait方法是空参，而计时等待是带参的。
     * 这种带参方法其实是一种倒计时操作，到时通知，如果提前得到唤醒通知，那么设定好的时间就显得多此一举了，
     * 这种设计方案其实是一举两得。如果没有得到唤醒通知，那么线程就处于计时等待状态，直到倒计时完毕自己醒来；
     * 如果在倒计时期间得到唤醒通知，那么线程从计时等待状态立刻唤醒。
     */
}
