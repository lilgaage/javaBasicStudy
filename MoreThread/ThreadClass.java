package MoreThread;

public class ThreadClass {
    /**
     * Thread类
     * 构造方法：
     *  public Thread()：分配一个新的线程对象
     *  public Thread(String name)：分配一个指定名字的新的线程对象
     *  public Thread(Runnable target)：分配一个带有指定目标的线程对象
     *  public Thread(Runnable target, String name)：分配一个带有指定目标的新的线程对象并指定名字
     * 常用方法：
     *  public String getName():获取当前线程名称
     *  public void start():此线程开始执行；java虚拟机调用此线程的run()方法
     *  public void run():此线程要执行的任务在此处定义代码
     *  public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂停停止执行）
     *  public static Thread currentThread():返回对当前正在执行的线程对象的引用
     *
     *  创建线程的方式共有两种：
     *      一种是继承Thread类
     *      一种是实现Runnable接口
     */
}
