package Stream;

import java.util.*;
import java.util.stream.Stream;

public class getStreamCollection {
    // java.util.Collection接口中加入了default方法stream用来获取流，所以其所有实现类均可获取流
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();
        Vector<String> vector = new Vector<>();
        Stream<String> stream3 = vector.stream();
    }
}
