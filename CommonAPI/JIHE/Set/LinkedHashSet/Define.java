package CommonAPI.JIHE.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Define {
    /*
    HashSet保证元素唯一，可是元素存放进去是没有顺序的，要保证有序该怎么办？
    有一个子类java.util.LinkedHashSet，是链表和哈希表组合的一个数据存储结构
     */
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("ddd");
        set.add("ccc");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) { // 判断是否有元素
            System.out.println(iterator.next()); // 获取迭代元素
        }
    }
}
