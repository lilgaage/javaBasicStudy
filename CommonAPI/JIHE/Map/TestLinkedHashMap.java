package CommonAPI.JIHE.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linMap = new LinkedHashMap<>();
        linMap.put("一", 1);
        linMap.put("二", 2);
        linMap.put("三", 3);
        Set<Map.Entry<String, Integer>> entrySet = linMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "对应的是" + value);
        }
    }
}
