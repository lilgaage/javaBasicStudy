package Lambda;

public class OlderRunnable {
    /**
     * 传统写法
     * 当需要启动一个线程去完成任务时，通常会通过java.lang.Runnable接口来定义任务内容，
     * 并使用java.lang.Thread类来启动该线程。
     *
     * 本着一切皆对象的思想，这种做法是无可厚非的：
     * 首先创建一个Runnable接口的匿名内部类对象来指定任务内容，再将其交给一个线程来启动。
     */
    public static void main(String[] args) {
        // 匿名内部类
        Runnable task = new Runnable() {
            @Override
            public void run() { // 重写抽象方法
                System.out.println("多线程任务执行");
            }
        };
        new Thread(task).start();
    }
    /**
     * 代码分析：
     *  对于Runnable的匿名内部类用法，可以分析出几点内容：
     *      1.Thread类需要Runnable接口作为参数，其中的抽象run()方法是用来指定线程任务内部的核心
     *      2.为了指定run的方法体，不得不需要Runnable接口的实现类
     *      3.为了省去定义一个RunnableImpl实现类的麻烦，不得不使用匿名内部类
     *      4.必须重写抽象方法run()，所以方法名、方法参数、方法返回值不得不再写一遍，且不写错
     *      5.实际上只有方法体才是关键所在。
     */

    /**
     *  编程思想转换：
     *      我们真的希望创建一个匿名内部类对象吗？并不，只是为了做这件事而不得不创建一个对象。
     *      真正希望做的事情是将run()体内的代码传递给Thread类知晓
     *      而创建对象只是受限于面向对象语法而不得不采取的一种手段方式。
     *      将关注点从“怎么做”回归到“做什么”的本质上，就会发现只要能够更好地达到目的，过程与形式并不重要。
     *      jdk8中，加入了Lambda表达式
     */
}
