package CommonAPI.Arrays;

import io.netty.util.internal.StringUtil;
import java.util.Arrays;

public class Array {
    /*
    java.util.Arrays包含用来操作数组的各种方法，比如排序和搜索等。
    其所有方法均为静态方法，调用起来非常简单。

     */
    public static void main(String[] args) {
        // 定义int[] 数组
        int[] arr = {2, 3, 5, 43, 234, 5};
        // 打印数组，输出地址值
        System.out.println(arr); // [I@7cd84586

        // public static String toString(int[] a):返回指定数组内容的字符串表示形式
        // 数组内容转为字符串
        String s1 = Arrays.toString(arr);
        // 打印字符串，输出内容
        System.out.println(s1); // [2, 3, 5, 43, 234, 5],字符串格式

        // public static void sort(int[] a) ：对指定的 int 型数组按数字升序进行排序
        System.out.println("排序前：" + Arrays.toString(arr)); // 排序前：[2, 3, 5, 43, 234, 5]
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr)); // 排序前：[2, 3, 5, 43, 234, 5]
    }
}
