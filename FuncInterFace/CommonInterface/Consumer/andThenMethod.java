package FuncInterFace.CommonInterface.Consumer;

import java.util.function.Consumer;

public class andThenMethod {
    /**
     *  如果一个方法的参数和返回值全都是Consumer类型，那么就可以实现效果：
     *      消费数据的时候，首先做一个操作，然后再做一个操作，实现组合。
     *  而这个方法就是Consumer接口中的default方法andThen
     *  jdk源码：
     *      default Consumer<T> andThen(Consumer<? super T> after) {
     *          Objects.requireNoNull(after);
     *          return (T t) -> {
     *              accept(t);
     *              after.accept(t);
     *          };
     *      }
     *  备注：java.util.Objects的requireNonNull的静态方法将会在参数为null时主动抛出
     *      NullPointerException。这省去了重复编写if语句和抛出空指针异常的麻烦。
     *
     *  要想实现组合，需要两个或多个Lambda表达式即可，而andThen的语义正式“一步接一步”操作。
     */
    private static void consumerString(Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept("Hello");
    }

    public static void main(String[] args) {
        consumerString(
                s -> System.out.println(s.toUpperCase()),
                s -> System.out.println(s.toLowerCase()));
    }
    /**
     *  运行结果：
     *      HELLO
     *      hello
     */
}
