package FuncInterFace.CommonInterface.Function;

import java.util.function.Function;

public class FunctionInterface {
    /**
     *  java.util.function.Function<T, R>接口用来根据一个类型的数据得到另一个类型的数据，
     *  前者称之为前置条件，后者称之为后置条件。
     *
     *  抽象方法apply：
     *      Function接口中最主要的抽象方法为R apply（T t），根据类型T的参数获取类型R的结果。
     *      使用的场景例如：将String类型转换为Integer类型。
     *
     *  默认方法andThen：
     *      Function接口中有一个默认的andThen方法，用来进行组合操作。
     *      jdk源码为：
     *          default <V> Function<T, V> andThen(Function<? super R, ? extends V> after {
     *              Objects.requireNonNull(after);
     *              return (T t) -> after.apply(apply(t));
     *          }
     */
    public static void main(String[] args) {
        applyMethod(s -> Integer.parseInt(s)); // parseInt解析字符串，返回一个整数

        defaultandThen(
                s -> Integer.parseInt(s) + 10, // 将字符串解析成为int数字
                i -> i *= 10); // 乘以10
                // 通过andThen将这两个操作连在了一起
    }

    private static void applyMethod(Function<String, Integer> function) {
        int num = function.apply("10");
        System.out.println(num + 20);
    }

    // Function的前置条件和后置条件泛型可以相同
    private static void defaultandThen(Function<String, Integer> one, Function<Integer, Integer> two) {
        int num = one.andThen(two).apply("10");
        System.out.println(num + 20);
    }
}
