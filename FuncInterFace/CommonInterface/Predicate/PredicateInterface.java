package FuncInterFace.CommonInterface.Predicate;

import java.util.function.Predicate;

// 有时候需要对某种类型的数据进行判断，从而得到一个boolean值结果。
// 这时可以用java.util.function.Predicate<T>接口
public class PredicateInterface {

    // 抽象方法Test
    // Predicate接口中包含一个抽象方法：boolean test(T t)，用于条件判断的场景
    private static void testAbs(Predicate<String> predicate) {
        boolean veryLong = predicate.test("HelloLilGaage");
        System.out.println("字符串很长吗" + veryLong);
    }

    // 默认方法and
    // 既然是条件判断，就会存在与或非三种常见关系。
    // 其中将两个Predicate条件使用“与”逻辑连接起来实现“并且”的效果，就会使用default方法and
    /**
     *  jdk源码为：
     *      default Predicate<T> and(Predicate<? super T> other) {
     *          Objects.requireNonNull(other);
     *          return (t) -> test(t) && other.test(t);
     *      }
     */
    private static void defaultAnd(Predicate<String> one, Predicate<String> two) {
        boolean isValid = one.and(two).test("HelloLilGaage");
        System.out.println("字符串符合要求吗" + isValid);
    }

    // 默认方法or
    // 与and的“与”类似，默认方法or实现逻辑关系中的“或”
    /**
     *  jdk源码为：
     *      default Predicate<T> or(Predicate<? super ?> other) {
     *          Objects.requireNonNull(other);
     *          return (t) -> test(t) || other.test(t);
     *      }
     */
    // 如果希望实现逻辑“字符串包含大写H 或者包含大写L”，那么代码只需要将and修改为or接口
    private static void defaultOr(Predicate<String> one, Predicate<String> two) {
        boolean isValid = one.or(two).test("HeeloLilGaage");
        System.out.println("字符串符合要求吗" + isValid);
    }

    // 默认方法negate
    // 非、取反,从结果可以看出，执行了test方法后，对结果boolean值进行取反而已。
    // 一定要在test方法调用前调用negate方法
    /**
     *  jdk源码为：
     *      default Predicate<T> negate() {
     *          return (t) -> !test(t);
     *      }
     */
    private static void defaultNegate(Predicate<String> predicate) {
        boolean veryLong = predicate.negate().test("HelloLilGaage");
        System.out.println("字符串很长吗" + veryLong);
    }

    public static void main(String[] args) {
        testAbs(s -> s.length() > 5);
        // 条件判断标准是传入的Lambda表达式逻辑，只要字符串长度大于5则认为很长

        defaultAnd(s -> s.contains("H"), s -> s.contains("w"));

        defaultOr(s -> s.contains("H"), s -> s.contains("W"));

        defaultNegate(s -> s.length() > 5);
    }
}
