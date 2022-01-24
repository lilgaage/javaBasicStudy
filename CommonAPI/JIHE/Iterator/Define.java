package CommonAPI.JIHE.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Define {
    /*
    在程序开发中，经常需要遍历集合中的所有元素，所以jdk专门提供了一个接口java.util.Itertor
    Iterator也是java集合中的一员，但它与Collection、Map接口有所不同，
    Collection和Map主要用于存储元素，而Iterator主要用于迭代访问（即遍历）Collection中的元素，
    因此Interator也被称为迭代器。

    迭代：即Collection集合元素的通用获取方式。在取元素之前先要判断集合汇总有没有元素，如果有，就把这个元素取出来
        继续再判断，如果还有就再取出来。一直把集合中的所有元素全部取出。这种取出方式叫做迭代。

    public Iterator iterator ：获取集合对应的迭代器，用来遍历集合中的元素
    public E next() ：返回迭代的下一个元素
    public boolean hasNext() :如果仍有元素可以迭代，则返回true
     */
    public static void main(String[] args) {
        // 创建一个集合对象
        Collection<String> collection = new ArrayList<>();
        collection.add("小琳");
        collection.add("小王");
        collection.add("小李");
        // 使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
        // 注意:Iterator<E>接口也是有泛型的,迭代器的泛型跟着集合走,集合是什么泛型,迭代器就是什么泛型
        // 每个集合对象都有自己的迭代器
        Iterator<String> iterator = collection.iterator();
        /*
            使用迭代器取出集合中元素的代码,是一个重复的过程
            所以我们可以使用循环优化
            不知道集合中有多少元素,使用while循环
            循环结束的条件,hasNext方法返回false
         */
        while (iterator.hasNext()) { // 判断是否有迭代元素
            String s = iterator.next(); // 获取迭代出的元素
            System.out.println(s);
        }
        // 如果集合中已经没有元素了，还继续使用迭代器的next方法，将抛出java.util.NoSuchElementException没有集合元素的错误
        for (Iterator<String> iterator1 = collection.iterator(); iterator1.hasNext();) {
            String s = iterator1.next();
            System.out.println(s);
        }

        /*
        迭代器的实现原理：
            当遍历集合时，首先通过调用集合的iterator()方法获得迭代器对象，然后使用hashNext()方法判断集合中是否存在下一个元素，
            如果存在，则调用next()方法将元素取出，否则说明已到达了集合末尾，停止遍历元素。
            Iterator迭代器对象在遍历集合时，内部采用指针的方式来跟踪集合中的元素。
            在调用Iterator的next方法之前，迭代器的索引位于第一个元素之前，不指向任何元素，
            当第一次调用迭代器的next方法后，迭代器的索引会向后移动一位，指向第一个元素并将该元素返回，
            当再次调用next方法时，迭代器的索引会指向第二个元素并将该元素返回，以此类推，知道hashNext方法返回false，
            表示达到了集合的末尾，终止对元素的遍历。
         */

        // 增强for循环
        /*
        增强for循环（也称for each循环）是jdk5以后出来的一个高级for循环，专门用来遍历数组和集合的。
        内部原理其实是个Iterator迭代器，所以在遍历过程中，不能对集合中的元素进行增删改查操作。
        格式：
            for(元素的数据类型 变量:Collection集合or数组){}
            用于遍历Collection和数组。通常只进行遍历元素，不要在遍历过程中对集合元素进行增删操作。
         */
        // 遍历数组
        int[] arr = {3, 4, 5, 6};
        for (int i : arr) { // 代表数组中的每个元素
            System.out.println(i);
        }

        // 遍历集合
        Collection<String> coll = new ArrayList<>();
        coll.add("小琳");
        coll.add("小王");
        coll.add("小李");
        for (String s : coll) {
            System.out.println(s);
        }
        // 新for循环必须有被遍历的目标。目标只能是Collection或数组。新式for仅仅作为遍历操作时使用

    }
}
