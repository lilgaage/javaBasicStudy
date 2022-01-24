package CommonAPI.Static;

import java.util.ArrayList;

public class Define {
    /*
    static修饰的内容：
        是随着类的加载而加载的，且只加载一次
        存储于一块固定的内存区域（静态区），所以可以直接被类名调用
        它优先于对象存在，所以可以被所有对象共享

    普通成员变量：操作各自空间
    静态成员变量：操作共享空间
     */



    // 静态代码块
    /*
    定义在成员位置，使用static修饰的代码块{}
    位置：类中方法外
    执行：随着类的加载而执行且执行一次，优先于main方法和构造方法的执行
    格式：
        public class ClassName{
            static{
                // 执行语句
            }
        }
     */
    // 作用：给类变量进行初始化赋值。
    public static int number;
    public static ArrayList<String> list;
    static {
        number = 2;
        list = new ArrayList<>();
        // 添加元素到集合中
        list.add("小刘");
        list.add("小琳");
    }

    public static void main(String[] args) {
        System.out.println(list);
    }
    /*
    static关键字可以修饰变量、方法和代码块。在使用过程中，其主要目的还是想在不创建对象的情况下去调用方法
     */
}
