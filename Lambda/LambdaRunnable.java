package Lambda;

public class LambdaRunnable {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("多线程任务执行")).start();
    }
    /**
     *  这段代码和刚才执行效果是完全一样的，可以在1.8或更高的编译级别下通过。
     *  从代码的语义中可以看出：启动了一个线程，而线程任务的内容以一种更加简洁的形式被指定
     *  不再有“不得不创建接口对象”的束缚，不再有“抽象方法覆盖重写”的负担
     */
}
