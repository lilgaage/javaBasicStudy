package CommonAPI.JIHE.List;

import java.util.ArrayList;
import java.util.List;

public class Define {
    // 是Collection的子类 java.util.List
    /*
    java.util.List接口继承自Collection接口，是单列集合的一个重要分支，
    习惯性地会将实现了List接口的对象称为List集合。
    在List集合中允许出现重复的元素，所有元素是以一种线性方式进行存储的，
    在程序中可以通过索引来访问集合中的指定元素。
    另外，List元素有序，存入顺序和取出顺序一致。
    List接口特点：
        1.元素存取有序。存元素的顺序是11、22、33，那么集合中元素的存储就是按照11、22、33的顺序完成的
        2.一个带索引的集合，通过索引就可以精确的操作集合中的元素（与数组的索引是一个道理）
        3.集合汇总可以有重复的元素，通过元素的equals方法，来比较是否为重复的元素。
    List接口的子类ArrayList中的方法都是来自List中定义的。
    List作为Collection集合的子接口，不但继承了Collection接口中的全部方法，而且还增加了一些根据元素索引来操作集合的特有方法
        public void add(int index, E element) : 将指定的元素，添加到该集合中的指定位置上。
        public E get(int index) :返回集合中指定位置的元素。
        public E remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
        public E set(int index, E element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 往尾部添加元素
        list.add("小琳");
        list.add("小王");
        // 往指定位置添加元素
        list.add(0, "小李");
        System.out.println(list);
        // 返回指定位置元素
        String s = list.get(0);
        System.out.println(s);
        // 移除指定位置元素 返回被移除的元素
        list.remove(0);
        // 用指定元素替换集合中指定位置的元素
        list.set(0, "小凯");
        System.out.println(list);
        // 遍历 size() get()
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // 增强for
        for (String i : list) {
            System.out.println(i);
        }
    }
}
