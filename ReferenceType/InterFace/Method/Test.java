package ReferenceType.InterFace.Method;

import java.util.ArrayList;
import java.util.List;

public class Test {

    //接口作为参数时，传递它的子类对象。
    //接口作为返回值类型时，返回它的子类对象。

    public static void main(String[] args) {

        ArrayList<Integer> srcList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            srcList.add(i);
        }
        // 因为方法参数是List，而ArrayList是List的子类，所以srcList可以传递。
        List list = getEvenNum(srcList);
        System.out.println(list);

    }

    public static List<Integer> getEvenNum(List<Integer> list) {

        // 创建保存偶数的集合
        ArrayList<Integer> evenList = new ArrayList<>();
        // 遍历集合list，判断元素为偶数，就添加到evenList中
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (integer % 2 == 0) {
                evenList.add(integer);
            }

        }
        // 因为方法返回值类型是List，而ArrayList是List的子类，所以evenList可以返回
        return evenList;
    }
}
