package CommonAPI.JIHE.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Define {
    /*
    java.util.Collections是集合工具类，用来对集合进行操作，部分方法有：
        public static <T> boolean addAll(Collection<T> c, T... elements) :往集合中添加一些元素。
        public static void shuffle(List<?> list) 打乱顺序 :打乱集合顺序。
        public static <T> void sort(List<T> list) :将集合中元素按照默认规则排序。
        public static <T> void sort(List<T> list，Comparator<? super T> ) :将集合中元素按照指定规则排序。
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 采用工具类 完成往集合中添加元素
        Collections.addAll(list, 2, 3222, 123);
        System.out.println(list);
        // 排序
        Collections.shuffle(list); // 随机排序
        System.out.println(list);
        Collections.sort(list); // 默认排序
        System.out.println(list);
        // public static <T> void sort(List<T> list，Comparator<? super T> ) :将集合中元素按照指定规则排序。
    }
}
