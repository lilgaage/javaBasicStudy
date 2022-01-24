package MoreThread;

public class NoNameInnerClassThread {
    /**
     *  匿名内部类方式实现线程的创建
     *  使用线程的匿名内部类方式，可以方便的实现每个线程执行不同的线程任务操作。
     *  使用你你们内部类的方式实现Runnable接口，重写Runnable接口中的run()
     */
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("小琳" + i);
                }
            }
        }; // 这个整体相当于new MyRunnable()
        new Thread(runnable).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("遛狗" + i);
        }
    }
}
