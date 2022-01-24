package Lambda;

public class RunnableImpl implements Runnable{
    /**
     *  使用实现类
     *      要启动一个线程，需要创建一个Thread类的对象并调用start方法。
     *      为了指定线程执行的内容，需要调用Thread类的构造方法：
     *          public Thread(Runnable target)
     *      为了获取Runnable接口的实现对象，可以为该接口定义一个实现类RunnableImpl
     */
    @Override
    public void run() {
        System.out.println("多线程任务执行");
    }
    // 然后创建该实现类的对象作为Thread类的构造参数
    public static void main(String[] args) {
        Runnable task = new RunnableImpl();
        new Thread(task).start();
    }
}
