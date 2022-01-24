package FuncInterFace.Lambda;

public class LogLambda {
    private static void log(int level, MessageBuilder builder) {
        if (level == 1) {
            System.out.println(builder.bulidMessage());
        }
    }

    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "Lil";
        String msgC = "Gaage";
        log(1, () -> msgA + msgB + msgC);
        // 这样一来，只有当级别满足要求时，才会进行三个字符串的拼接；否则不会进行拼接
        log(2, () -> {
            System.out.println("Lambda执行");
            return msgA + msgB + msgC;
        });
        // 从结果可以看出，在不符合级别要求的情况下，Lambda将不会执行。从而达到节省性能的效果。
        // 使用内部类也可以达到同样的效果，只是将代码操作延迟到了另外一个对象当中
        // 通过调用方法来完成。而是否调用其所在方法是在条件判断后才执行的。
    }
}
