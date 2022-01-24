package CommonAPI.JIHE.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ergodic {
    // 遍历
    public static void main(String[] args) {
        K();
        KV();

    }
    // 键找值 根据键获取值使用方法get(K key)
    // 获取Map中所有的键，由于键是唯一的，所以返回一个Set集合存储所有的键，使用keySet()
    public static void K() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("一", 1);
        map.put("二", 2);
        map.put("三", 3);
        // 遍历所有的键，获取键集
        Set<String> keys = map.keySet();
        // 遍历键集，得到每一个键
        for (String key : keys) {
            // 获取对应值
            Integer value = map.get(key);
            System.out.println( key + "对应" + value);
        }
    }

    // 遍历键值对
    // Entry键值对对象
    /*
        Map中存放在key和value两种对象，在Map中是一一对应的关系，
        这一对对象又称做Map中的一个Entry项。Entry将键值对的对应关系封装成了对象，
        即键值对对象，遍历时，可以从每一个键值对Entry对象获取对应的键与值。
            public K getKey() ：获取Entry对象中的键。
            public V getValue() ：获取Entry对象中的值。
        在Map集合中也提供了获取所有Entry对象的方法：
            public Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)

        获取所有键值对对象，以Set集合形式返回，使用方法entrySet()
        遍历Set集合，得到所有键值对对象
        通过键值对对象，获取键与值，getKey() getValue()
     */
    public static void KV() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("一", 1);
        map.put("二", 2);
        map.put("三", 3);
        // 获取所有的Entry键值对对象
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        // 遍历
        for (Map.Entry<String, Integer> entry : entrySet) {
            // 解析
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "对应的是" + value);
        }
    }
    // Map集合不能直接使用迭代器或者foreach进行遍历。但是转成set之后就可以使用了
}
