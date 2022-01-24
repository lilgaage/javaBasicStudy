package CommonAPI;

import java.util.ArrayList;

public class PackageClass {
    /*
    使用基本类型在于效率，然而很多情况会创建对象使用，因为对象可以做更多的功能，
    如果想要基本类型像对象一样操作，就可以使用基本类型对应的包装类。
    | 基本类型  |对应的包装类(位于java.lang包中)|
    | ------- | --------------------- |
    | byte    | Byte                  |
    | short   | Short                 |
    | int     | **Integer**           |
    | long    | Long                  |
    | float   | Float                 |
    | double  | Double                |
    | char    | **Character**         |
    | boolean | Boolean               |


    装箱：从基本类型转换为对应的包装类对象
        构造方法:
            Integer(int value) 构造一个新分配的 Integer 对象，它表示指定的 int 值。
            Integer(String s) 构造一个新分配的 Integer 对象，它表示 String 参数所指示的 int 值。
                传递的字符串,必须是基本类型的字符串,否则会抛出异常 "100" 正确  "a" 抛异常
        静态方法:
            static Integer valueOf(int i) 返回一个表示指定的 int 值的 Integer 实例。
            static Integer valueOf(String s) 返回保存指定的 String 的值的 Integer 对象。
    拆箱:从包装类对象转换为基本类型(包装类->基本类型的数据)
        成员方法:
            int intValue() 以 int 类型返回该 Integer 的值
     */
    public static void main(String[] args) {
        // 装箱 基本类型--->包装类
        // 构造方法
        Integer integer = new Integer(213); // 使用构造函数
        System.out.println(integer); // 重写了toString方法
        Integer integer1 = new Integer("1");
        System.out.println(integer1); // 1
        // 静态方法
        Integer integer2 = Integer.valueOf(3);
        System.out.println(integer2);
        Integer integer3 = Integer.valueOf("5");
        System.out.println(integer3);
        // 拆箱 包装类--->基本类型
        int i = integer.intValue();
        System.out.println(i);



        // 由于经常要做基本类型与包装类之间的转换，所以从jdk5开始，装箱、拆箱可以自动完成
        // 自动装箱 直接把int类型的整数赋值给包装类
        Integer integer4 = 1; // 相当于Integer interger4 = new Integer(4);
        // 自动拆箱 包装类,无法直接参与运算,可以自动转换为基本数据类型,再进行计算
        integer4 = integer4 +2; // 相当于integer4.intValue() + 2

        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList无法直接存储整数
        list.add(5); // 自动装箱， list.add(new Integer(5))
        int a = list.get(0); // 自动拆箱 list.get(0).intValue()



        // 基本类型与字符串之间的转换
        /*
        基本类型->字符串(String)
        1.基本类型的值+""  最简单的方法(工作中常用)
        2.包装类的静态方法toString(参数),不是Object类的toString() 重载
            static String toString(int i) 返回一个表示指定整数的 String 对象。
        3.String类的静态方法valueOf(参数)
            static String valueOf(int i) 返回 int 参数的字符串表示形式。
    字符串(String)->基本类型
        使用包装类的静态方法parseXXX("字符串");
            Integer类: static int parseInt(String s)
            Double类: static double parseDouble(String s)
         */
        // 基本类型直接与""相连接即可； 例如 34+""
        int i1 = 3;
        String s1 = i1+"";
        System.out.println(s1 + 10); // 310
        String s = i1 + "6";
        System.out.println(s); // 36
        String s2 = Integer.toString(100);
        System.out.println(s2 + 20); // 10020
        String s3 = String.valueOf(20);
        System.out.println(s3 + 22); // 2022
        // 除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型
//        public static byte paresByte(String s) {}
//        public static short parseShort(String s) {}
//        public static int parseInt(String s) {}
//        public static long parseLong(String s) {}
//        public static float parseFloat(String s) {}
//        public static double parseDouble(String s) {}
//        public static boolean parseBoolean(String s) {}
        int num = Integer.parseInt("100");
        System.out.println(num);
        int num2 = Integer.parseInt("a"); // 字符串参数无法转换为对应的基本类型，抛出java.lang.NumberFormatException异常
        System.out.println(num2);

    }
}
