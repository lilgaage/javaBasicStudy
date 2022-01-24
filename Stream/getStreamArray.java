package Stream;

import java.util.stream.Stream;

public class getStreamArray {
    // 如果使用的不是集合或映射而是数组，由于数组对象不可能添加默认方法，
    // 所以Stream接口中提供了静态方法of
    public static void main(String[] args) {
       String[] array = {"小琳", "小李", "小王"};
        Stream<String> stream = Stream.of(array); // of方法的参数是一个可变参数，所以支持数组
    }
}
