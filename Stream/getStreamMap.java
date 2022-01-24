package Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class getStreamMap {
    // java.util.Map接口不是Collection的子接口，且其K-V数据结构不符合流元素的单一特征，
    // 所以获取对应的流需要分key、value或entry等情况
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Stream<String> KeyStream = map.keySet().stream();
        Stream<Integer> ValueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();
    }
}
