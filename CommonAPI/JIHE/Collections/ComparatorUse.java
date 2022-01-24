package CommonAPI.JIHE.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorUse {
    // Comparator比较器
    public static void main(String[] args) {
        showSort1();
        showSort2();
    }
    // public static <T> void sort(List<T> list) :将集合中元素按照默认规则排序
    public static void showSort1() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "小琳", "小李", "小王", "小三");
        Collections.sort(list); // 默认规则排序
        System.out.println(list); // [小三, 小李, 小王, 小琳]
    }
        /*
        默认规则排序是怎么样的？
            说到排序，简单来说就是两个对象之间比较大小，那么在java中提供了两种比较实现的方式，
            一种是比较死板的采用java.lang.Comparable接口去实现，
            一种是灵活的，当需要做排序的时候再去选择的java.util.Commparator接口完成。
        我们采用的public static <T> void sort(List<T> list)这个方法完成的排序，
        实际上要求了被排序的类型需要实现Comparable接口完成比较的功能，在String类型上如下：
            public final class String implements java.io.Serializable, Comparable<String>, CharSequence {}
        String类实现了这个接口，位于java.util包下，排序是comparator能实现的功能之一，
        该接口代表一个比较器，比较器顾名思义就是做排序的，通俗地讲需要比较两个对象谁排在前面谁排在后面，
        那么比较的方法就是public int compare(String o1, String o2)：比较其两个参数的顺序。
            两个对象比较的结果有三种：大于、小于、等于。
            如果要按照升序排序，则o1小于o2返回（负数），相等返回0，o1大于o2返回（正数），
            如果按照降序排序，则o1小于o2返回（正数），相等返回0，o1大于o2返回（负数）
         */
    public static void showSort2() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc");
        // 排序方法，按照第一个字母的降序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });
        System.out.println(list); // [ccc, bbb, aaa]
    }
    /*
    Comparable和Comparator两个接口的区别：
        Comparable：强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，
            类的comparaTo方法被称为它的自然比较方法。只能在类中实现comparaTo()一次，不能经常修改类的代码实现自己想要的排序。
            实现此接口的对象列表（和数组）可以通过Collections.sort（和Arrays.sort）进行自动排序，
            对象可以用作有序映射中的键或有序集合中的元素，无需指定比较器。
        Comparator：强行对某个对象进行整体排序。可以将Comparator传递给sort方法（如Collections.sort
            或Arrays.sort），从而允许在排序顺序上实现精确控制。还可以使用Comparator赖控制某些数据结构
            （如有序set或有序映射）的顺序，或者为那些没有自然顺序的对象collection提供排序。
     */

}
