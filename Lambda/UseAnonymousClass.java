package Lambda;

public class UseAnonymousClass {
    /**
     *  使用匿名内部类
     *      这个RunnableImpl类只是为了实现Runnable接口而存在的，而且仅被使用了唯一一次，
     *      所以使用匿名内部类的语法即可省去该类的单独定义，即匿名内部类
     */
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程任务执行");
            }
        }).start();
    }
    /**
     *  匿名内部类的好处与弊端：
     *      省去实现类的定义，但语法复杂
     *
     *  语法分析：
     *      Runnable接口只有一个run方法的定义public abstract void run()；
     *      即制定了一种做事情的方案（其实就是一个函数）：
     *          无参：不需要任何条件即可执行该方案
     *          无返回值：不产生任何结果
     *          代码块（方法体）：具体执行步骤
     *      同样的语义体现在Lambda语法中，要更加简单：
     *          () -> System.out.println("多线程任务执行");
     *          前面的()即run方法的参数无，代表不需要任何条件
     *          中间的箭头代码将前面的参数传递给后面的代码
     *          后面的输出语句即业务逻辑代码
     */

    /**
     *  Lambda标准格式：
     *      Lambda省去面向对象的条条框框，格式由三个部分组成：
     *          一些参数、一个箭头、一段代码
     *          (参数类型 参数名称) -> { 代码语句}
     *  格式说明：
     *      小括号内的语法与传统方法参数列表一致：无参留空、多参逗号分隔
     *      ->是引入的语法格式，代表指向动作
     *      大括号内语法与传统方法体要求基本一致。
     */
}
