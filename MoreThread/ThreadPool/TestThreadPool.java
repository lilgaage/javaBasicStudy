package MoreThread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        // 创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2);
        // 创建Runnable示例对象
        MyRunnable runnable = new MyRunnable();

//        // 自己创建线程的方式
//        Thread thread = new Thread(runnable);
//        thread.start();

        // 从线程池中获取线程对象，然后再调用MyRunnable中的run()
        service.submit(runnable);
        // 再获取线程对象，调用MyRunnable中的run()
        service.submit(runnable);
        service.submit(runnable);
        /**
         * submit方法调用结束后，程序并不终止，是因为线程池控制了线程的关闭
         * 将使用完的线程又归还到了线程池中
         */
//        service.shutdown(); // 关闭线程池
    }
}
