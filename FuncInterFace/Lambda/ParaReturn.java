package FuncInterFace.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class ParaReturn {
    /**
     *  使用Lambda作为参数和返回值
     *  如果抛开实现原理不说，java中的Lambda表达式可以被当做是匿名内部类的替代品。
     *  如果方法的参数是一个函数式接口类型，那么就可以使用Lambda表达式进行替代。
     *  使用Lambda表达式作为方法参数，其实就是使用函数是接口作为方法参数。
     *
     *  例如java.lang.Runnable接口就是一个函数是接口，假设有一个startThread方法
     *  使用该接口作为参数，那么就可以使用Lambda进行传参。这种情况其实和Thread类的构造方法参数为Runnable没有本质区别
     */
    private static void startThread(Runnable task) {
        new Thread(task).start();
    }

    public static void main(String[] args) {
        startThread(() -> System.out.println("线程任务执行"));


        // 类似的，如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
        // 当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时，就可以调该方法获取

        String[] array = {"abc", "ab", "abcd"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, newComparator());
        System.out.println(Arrays.toString(array));
    }
    private static Comparator<String> newComparator() {
        return (a, b) -> b.length() - a.length();
        // 直接return一个Lambda表达式即可。
    }
}
