package CommonAPI.JIHE.Map;

import java.util.HashMap;

public class Define {
    /*
    现实生活中，常有这样一种集合：
        IP地址与主机名、身份证号与个人、系统用户名与系统用户对象等，
    这种一一对应的关系叫做映射。java提供了专门的集合类用来存放这种对象关系的对象，
    即java.util.Map接口。

    Collection中的集合，元素是孤立存在的，向集合中存储元素采用一个个元素的方式存储。
    Map中的集合，元素是成对存在的。每个元素由键、值两部分组成，通过键可以找到所对应的值。
    Collection中的集合称为单列集合，Map中的集合称为双列集合。
    需要注意的是：Map中的集合不能包含重复的键，值可以重复；每个键只能对应一个值。

    Map常用子类：HashMap、LinkedHashMap
    HashMap：存储数据采用的哈希表结构，元素的存取顺序不能保证一致。由于保证键的唯一、不重复，
        需要重写键的HashCode和equals方法。
    LinkedHashMap：存储结构采用的哈希表结构+链表结构。通过链表结构可以保证元素的存取顺序一致；
        通过哈希表结构可以保证键的唯一、不重复，需要重写HashCode和equals方法。
    tips：Map接口的集合都有两个泛型变量，在使用时，要为两个泛型变量赋予数据类型。
        两个泛型变量的数据类型可以相同，也可以不同。

    Map接口的常用方法：
        public V put(K key, V value) : 把指定的键与指定的值添加到Map集合中。
        public V remove(Object key) : 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
        public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
        public Set<K> keySet() : 获取Map集合中所有的键，存储到Set集合中。
        public Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)。
     */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // 添加
        map.put("小鬼", "小琳");
        map.put("小王", "遛狗");
        // 删除指定键key所对应的键值对元素，返回value的值
        System.out.println(map.remove("小王"));
        // 根据指定的键获取对应的值
        System.out.println(map.get("小鬼"));
        System.out.println(map);
        /*
        tips:
            使用put方法时，若指定的键(key)在集合中没有，则没有这个键对应的值，返回null，并把指定的键值添加到集合中；
            若指定的键(key)在集合中存在，则返回值为集合中键对应的值（该值为替换前的值），并把指定键所对应的值，替换成指定的新值。
         */
    }
}
