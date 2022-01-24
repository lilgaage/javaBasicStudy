package CommonAPI.JIHE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Collection {
    /*
    集合是java中提供的一种容器，可以用来存储多个数据
    数组的长度是固定的，集合的长度是可变的；
    数组中存储的是同一类型的元素，可以存储基本数据类型值，集合存储的是对象，且对象类型可以不一致。

    集合框架：
        JAVASE提供了满足各种需求的API，在使用这些API前，先了解继承与接口操作架构，才能了解何时采用哪个类，
        以及类之间如何彼此合作，从而达到灵活应用。
        集合按照其存储结构可分为两大类，分别是单列集合java.util.Collection和双列集合java.util.Map。

    Collection：
        单列集合类的跟接口，用于存储一系列符合某种规则的元素，
        有两个重要的子接口，分别是java.util.List和java.util.Set。
        List的特点是元素有序、元素可重复。主要实现接口有ArrayList和LinkedList
        Set的特点是元素无序，而且不可重复。主要实现接口有HashSet和TreeSet

    常用功能：Collection是所有单列集合的父接口，
        因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合
        public boolean add(E e)： 把给定的对象添加到当前集合中 。
        public void clear() :清空集合中所有的元素。
        public boolean remove(E e): 把给定的对象在当前集合中删除。
        public boolean contains(E e): 判断当前集合中是否包含给定的对象。
        public boolean isEmpty(): 判断当前集合是否为空。
        public int size(): 返回集合中元素的个数。
        public Object[] toArray(): 把集合中的元素，存储到数组中
     */
    public static void main(String[] args) {
        // 创建集合对象 可以使用多态形式
        java.util.Collection<String> collArray = new ArrayList<>();
        java.util.Collection<String> collSet = new HashSet<>();
        System.out.println(collArray); // [] 重写了toString方法
        System.out.println(collSet); // [] 重写了toString方法

        // 添加 public boolean add(E e)：返回值是一个boolean值,一般都返回true,所以可以不用接收
        boolean b1 = collArray.add("小琳");
        System.out.println(b1); // true
        System.out.println(collArray); // [小琳]
        collArray.add("小李");
        collArray.add("小王");
        System.out.println(collArray); // [小琳, 小李, 小王]

        // public boolean remove(E e): 把给定的对象在当前集合中删除。
        // 返回值是一个boolean值,集合中存在元素,删除元素,返回true
        // 集合中不存在元素,删除失败,返回false
        boolean b2 = collArray.remove("小王");
        boolean b3 = collArray.remove("小王八");
        System.out.println(b2); // true
        System.out.println(b3); // false
        System.out.println(collArray); // [小琳, 小李]

        // public boolean contains(E e): 判断当前集合中是否包含给定的对象。包含返回true,不包含返回false
        boolean b4 = collArray.contains("小琳");
        boolean b5 = collArray.contains("小王八");
        System.out.println(b4); // true
        System.out.println(b5); // false

        //public boolean isEmpty(): 判断当前集合是否为空。 集合为空返回true,集合不为空返回false
        boolean b6 = collArray.isEmpty();
        boolean b7 = collSet.isEmpty();
        System.out.println(b6); // false
        System.out.println(b7); // true

        // public int size(): 返回集合中元素的个数
        int count = collArray.size();
        int count1 = collSet.size();
        System.out.println(count); // 2
        System.out.println(count1); // 0

        // public Object[] toArray(): 把集合中的元素，存储到数组中
        Object[] arr = collArray.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr)); // [小琳, 小李]

        // public void clear() :清空集合中所有的元素
        collArray.clear();
        System.out.println(collArray); // []
    }

}
