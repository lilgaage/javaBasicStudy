package MoreThread;

public class MyRunnable implements Runnable{
    /**
     * 采用java.lang.Runnable也是非常常见的一种，只需要重写run()即可
     * 步骤如下：
     *  1.定义Runnable接口的实现类，并重写该接口的run()方法,该run()方法的方法体同样是该线程的线程执行体
     *  2.创建Runnable实现类的实例，并以此实例作为Thread的target来创建Thread对象，该Thread对象才是真正的线程对象
     *  3.调用线程对象的start()来启动线程。
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "小琳");
        thread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("遛狗" + i);
        }
    }
    /**
     * 通过实现Runnable接口，使得该类有了多线程类的特征。run()方法是多线程程序的一个执行目标。
     * 所有的多线程代码都在run()里面。Thread类实际上也是实现了Runnable接口的类。
     * 在启动多线程的时候，需要先通过Thread类的构造方法Thread(Runnable target)构造出对象，
     * 然后调用Thread对象的start()方法来运行多线程代码。
     * 实际上所有的多线程代码都是通过运行Thread的start()方法来运行的。
     * 因此，不管是继承Thread类的API还是实现Runnable接口来实现多线程，最终还是通过Thread的对象API来控制线程的，
     * 熟悉Thread类的API是进行多线程编程的基础。
     *
     * tips：Runnable对象仅仅作为Thread对象的target，Runnable实现类里包含的run()方法仅作为线程执行体。
     * 而实际的线程对象依然是Thread实例，只是该Thread线程负责执行其target的run()方法。
     *
     *
     *
     * Thread和Runnable的区别：
     *      如果一个类继承Thread，则不适合资源共享；
     *      但是如果实现了Runnable接口的话，则很容易实现资源共享。
     * 实现Runnable接口比继承Thread类所具有的优势：
     *      1.适合多个相同的程序代码的进程去共享同一个资源
     *      2.可以避免java中的单继承的局限性
     *      3.增加程序的健壮性，实现解耦操作，代码可以被多个线程共享，代码和线程独立
     *      4.线程池只能放入实现Runnable或Callable类线程，不能直接放入继承Thread的类。
     *
     *  扩充：在java中，每次程序运行至少启动2给线程。一个是main线程，一个是垃圾收集线程。
     *  因为每当使用java命令执行一个类时，实际上都会启动一个jvm，每一个jvm其实就是在操作系统中启动了一个进程。
     *
     */
}
