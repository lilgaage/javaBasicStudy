package FuncInterFace.Lambda;

public class LambdaLayback {
    /**
     *  在兼顾面向对象特性的基础上，java语言通过Lambda表达式与方法引用等，
     *  为开发者打开了函数式编程的大门。
     *
     *  有些场景的代码执行后，结果不一定会被使用，从而造成性能浪费。
     *  而Lambda表达式是延迟执行的，这正好可以作为解决方案，提升性能。
     *
     *
     */
    //  性能浪费的日志案例：
    //      注：日志可以帮助我们快速定位问题，记录程序运行过程中的情况，以便项目的监控和优化。
    //      一种典型的场景就是对参数进行有条件使用，例如对日志消息进行拼接后，在满足条件的情况下进入打印输出：
    private static void log(int level, String msg) {
        if (level == 1) {
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "Lil";
        String msgC = "Gaage";
        log(1, msgA + msgB + msgC);
    }
    /**
     *  这段代码存在问题：无论几倍是否满足要求，作为log方法的第二个参数，三个字符串一定会首先
     *  被拼接并传入方法内，然后陈彩虹进行级别判断。如果级别不符合要求，那么字符串的拼接操作就白做了，存在性能浪费。
     *  备注：slf4j是应用非常广泛的日志框架，它在记录日志时为了解决这种性能浪费的问题，
     *      并不推荐首先进行字符串的拼接，而是将字符串的若干部分作为可变参数传入方法中，
     *      仅在日志级别满足要求的情况下才会进行字符串拼接。
     *      例如LOGGER.debug("变量{}的取值为：", "os", "macOS),
     *      其中的大括号{}为占位符。如果满足日志级别要求，则会将“os”和“macOS”两个字符
     *      依次拼接到大括号的位置；否则不会进行字符串拼接。
     *      这也是一种可行解决方案，但Lambda可以做到更好。
     */
}
