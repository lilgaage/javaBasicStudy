package CommonAPI.JIHE.Generic;

import java.util.ArrayList;
import java.util.Collection;

public class WildCard {
    // 泛型通配符：
    // 当使用泛型类或者接口时，传递的数据中，泛型类型不确定，可以通过通配符<?>表示。
    // 但一旦使用泛型的通配符后，只能使用Object类中的共性方法，集合元素自身方法无法使用。
    // 此时只能接收数据，不能往该集合中存储数据   ?存疑
    public static void getElement(Collection<?> collection) { // ?表示可以接收任意类型
        System.out.println(collection);
    }

    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        list1.add(5);
        getElement(list1);
        Collection<String> list2 = new ArrayList<>();
        getElement(list2);

    // tips:泛型不存在继承关系 Collection <Object> list = new ArrayList<String>();是错误的


    // 受限泛型
    // 之前设置泛型时，实际上是可以任意设置的，只要是类就可以设置。
    // 但是在JAVA的泛型中可以指定一个泛型的上限和下限。
    // 泛型的上限：
        // 格式： 类型名称 <? extends 类> 对象名称
        // 意义：只能接收该类型及其子类
    // 泛型的下限：
        // 格式：类型名称 <? super 类> 对象名称
        // 意义：只能接收该类型及其父类型

    // 比如：现在已知Object类、String类、Number类、Integer类，其中Number是Integer的父类
        Collection<Integer> collInt = new ArrayList<>();
        Collection<String> collStr = new ArrayList<>();
        Collection<Number> collNum = new ArrayList<>();
        Collection<Object> collObj = new ArrayList<>();
        getElement1(collInt);
//        getElement1(collStr); // 报错
        getElement1(collNum);
//        getElement1(collObj); // 报错

//        getElement2(collInt); // 报错
//        getElement2(collStr); // 报错
        getElement2(collNum);
        getElement2(collObj);

    }
    // 泛型的上限：此时的泛型？必须是Number类型或Number类型的子类
    public static void getElement1(Collection<? extends Number> collection) {}
    // 泛型的下限：此时的泛型？必须是Number类型或Number类型的父类
    public static void getElement2(Collection<? super Number> collection) {}
}
