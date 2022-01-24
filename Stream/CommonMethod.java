package Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonMethod {
    /**
     *  流模型的操作很丰富，常用方法可以被分成两种：
     *      延迟方法：返回值类型仍然是Stream接口自身类型的方法，因此支持链式调用。
     *          （除了终结方法外，其余方法均为延迟方法）
     *      终结方法：返回值类型不再是Stream接口自身类型的方法，
     *          因此不再支持类似StringBuilder那样的练市调用。
     *          本类中，终结方法包括count和forEach方法
     */

    public static void main(String[] args) {
        forEachMethod();
        filterMethod();
        mapMethod();
        countMethod();
        limitMethod();
        skipMethod();
        concatMethod();
    }

    /** 逐一处理 forEach
     *  虽然方法名字叫forEach，但与for循环中的for-each不同
     *  void forEach(Consumer<? super T> action);
     *  该方法接收一个Consumer接口函数，会将每一个流元素交给该函数进行处理
     *      java.util.function.Consumer<T>接口是一个消费型接口。
     *      Consumer接口中包含抽象方法void accept（T t），意为消费一个指定泛型的数据
     */
    private static void forEachMethod() {
        Stream<String> stream = Stream.of("小琳", "小李", "小王");
        stream.forEach(name -> System.out.println(name));
    }

    /** 过滤 filter
     *  可以通过filter方法将一个流转换成另一个子集流
     *  Stream<T> filter(Predicate <? super T> predicate);
     *  该接口接收一个Predicate函数式接口参数（可以是一个Lambda或方法引用）作为少吃条件。
     *      java.util.stream.Predicate函数式接口中唯一的抽象方法为：
     *          boolean test(T t);
     *      该方法将会产生一个boolean值结果，代表指定的条件是否满足。
     *      如果结果为true，那么Stream流的filter方法将会留用该元素；
     *      如果结果为false，那么filter方法将会舍弃元素。
     */
    private static void filterMethod() {
        Stream<String> stream = Stream.of("小琳", "小李", "小王");
        Stream<String> result = stream.filter(s -> s.startsWith("小")); // Lambda指定了筛选的条件
        result.forEach(System.out::println);
    }

    /** 映射 map
     *  如果需要将流中的元素映射到另一个流中，可以使用map方法
     *  <R> Stream<R> map(Function<? super T, ? extends R> mapper);
     *  该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流
     *  java.util.stream.Function函数式接口，其中唯一的抽象方法为R apply(T t);
     *  可以将一种T类型转换为R类型，而这种转换的动作，叫做“映射”
     */
    private static void mapMethod() {
        Stream<String> stream = Stream.of("10", "2", "7");
        Stream<Integer> result = stream.map(s -> Integer.parseInt(s));
        result.forEach(System.out::println);
    } // map方法的参数通过方法引用，将字符串类型转换成了int类型，并自动装箱为Integer类对象

    /** 统计个数 count
     *  正如旧集合Collection中的size()一样，流提供count()来计数元素个数long count();
     *  该方法返回一个long值代表匀速个数，不再像旧集合那种是int值
     */
    private static void countMethod() {
        Stream<String> stream = Stream.of("小琳", "小李", "小王");
        Stream<String> result = stream.filter(s -> s.endsWith("琳"));
        System.out.println(result.count());
    }

    /** 取用前几个 limit
     *  limit方法可以对流进行截取，只取用前n个
     *  Stream<T> limit(long maxSize);
     *  参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作
     */
    private static void limitMethod() {
        Stream<String> stream = Stream.of("小琳", "小李", "小王");
        Stream<String> result = stream.limit(2);
//        System.out.println(result.count());
        System.out.println(result.collect(Collectors.toList()));
    }

    /** 跳过前几个 skip
     *  如果希望跳过前几个元素，可以使用skip方法获取一个截取之后的新流Stream<T> skip(long n);
     *  如果流的当前长度大于n，则跳过前n个；否则会得到一个长度为0的空流
     */
    private static void skipMethod() {
        Stream<String> stream = Stream.of("小琳", "小李", "小王");
        Stream<String> result = stream.skip(2);
//        System.out.println(result.count());
        System.out.println(result.collect(Collectors.toList()));
    }

    /** 组合 concat
     *  如果有两个流希望合并成为一个流，那么可以使用Stream接口的静态方法concat
     *      static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
     *  备注：这是一个静态方法，与java.util.String中的concat方法是不同的
     */
    private static void concatMethod() {
        Stream<String> stream = Stream.of("小琳");
        Stream<String> stream2 = Stream.of("小李", "小王");
        Stream<String> result = Stream.concat(stream, stream2);
        System.out.println(result.count());
    }
}
