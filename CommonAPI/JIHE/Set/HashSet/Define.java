package CommonAPI.JIHE.Set.HashSet;

import java.util.HashSet;

public class Define {
    /*
    HashSet是Set接口的一个实现类，所存储的元素是不可重复的，并且元素都是无序的（即存取顺序不一致）。
    java.util.HashSet底层的实现其实是一个java.util.HashMap支持。
    HashSet是根据对象的哈希值来确定元素在集合中的存储位置，因此具有良好的存取和查找性能。
    保证元素唯一性的方式依赖于hashCode和equals方法。
     */
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("小琳");
        set.add("小王");
        set.add("小李");
        set.add("小李");
        for (String s : set) {
            System.out.println(s);
            // 输出结果如下： 说明集合中不能存储重复元素
            // 小李
            // 小王
            // 小琳
        }
    }
}
