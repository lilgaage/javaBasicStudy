package CommonAPI.JIHE.List.ArrayList;

import java.util.ArrayList;

public class ArrayListAPI {
    // ArrayList集合数据存储的结构是数组结构。元素增删慢，查找快。由于使用最多的功能为查询、遍历数据，所以ArrayList是最常用的集合
    /*
    根据ObjectArray.java可以看到，想存储对象数据，选择的容器是对象数组。而数组的长度是固定的，无法适应数据变化
    为了解决这个问题，java提供了另一个容器java.util.ArrayList集合类，可以更便捷的存储和操作对象数据
     */

    //java.util.ArrayList是大小可变的数组的实现，存储在内的数据称为元素，可不断添加元素，大小也自动增长

    //查看类：java.util.ArrayList <E>
    //<E>表示指定一种数据类型，叫做泛型。E取自Element（元素）的首字母。
    // 在出现 E 的地方，使用一种引用数据类型将其替换即可，表示将存储哪种引用类型的元素
//    ArrayList<String>, ArrayList<ObjectArray>

    //查看构造方法
//    public ArrayList():构造一个内容为空的集合

    //基本格式
    ArrayList<String> list = new ArrayList<String>();
    //在JDK 7后,右侧泛型的尖括号之内可以留空，但是<>仍然要写:
    ArrayList<String> list1 = new ArrayList<>();

    //查看成员方法
        // public boolean add(E e) ： 将指定的元素添加到此集合的尾部。
        // 参数 E e ，在构造ArrayList对象时， <E> 指定了什么数据类型
        // 那么 add(E e) 方法中，只能添加什么数据类型的对象。
    public static void main(String[] args){
        //创建学生数组
        ArrayList<String> list = new ArrayList<>();

        //创建学生对象
        String s1 = "刘";
        String s2 = "王";
        String s3 = "李";

        //打印学生ArrayList集合
        System.out.println(list); //[]

        //把学生对象作为元素添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //打印
        System.out.println(list);//[刘, 王, 李]
    }
}
