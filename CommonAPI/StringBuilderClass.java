package CommonAPI;

public class StringBuilderClass {
    /*
    字符串拼接问题：
        由于String类的对象内容不可改变，所以每当进行字符串拼接时，总是会在内存中创建一个新的对象
        String s = "Lil";
        s += "Gaage";
        System.out.println(s);
    在API中，对String类有这样的描述：字符串时常量，它们的值在创建后不能被更改。
    根据这句话可以分析上面的代码，总共产生了三个字符串。引用变量s首先指向”Lil“对象，最终指向拼接出来的新字符串对象。
    由此可知，如果对字符串进行拼接操作，每次拼接，都会去构建一个新的String对象，即耗时又浪费空间。
    为了解决这一问题，可以使用java.lang.StringBuilder类。

    StringBuilder又称为可变字符序列，它是一个类似于 String 的字符串缓冲区，通过某些方法调用可以改变该序列的长度和内容。
    原来StringBuilder是个字符串的缓冲区，即它是一个容器，容器中可以装很多字符串。并且能够对其中的字符串进行各种操作。
    它的内部拥有一个数组用来存放字符串内容，进行字符串拼接时，直接在数组中加入新内容。StringBuilder会自动维护数组的扩容。
    (默认16字符空间，超过自动扩充)

     */
    public static void main(String[] args) {
        // 构造方法：
        //        public StringBuilder() : 构造一个空的StringBuilder容器
        //        public StringBuilder(String str) : 构造一个StringBuilder容器并将字符串加入进去
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1); // 空白
        StringBuilder sb2 = new StringBuilder("LilGaage");
        System.out.println(sb2); // LilGaage


        // 常用方法：
//            public StringBuilder append(...) : 添加任意类型数据的字符串形式，并返回当前对象本身
//            public String toString() : 将当前StringBuilder对象转换为String对象
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = builder.append("LilGaage");
        System.out.println(builder == builder1); // true
        builder.append(true);
        builder.append(3);
        // 在开发中，会遇到调用一个方法后，返回一个对象的情况。然后使用返回的对象继续调用方法
        // 这种时候就可以吧代码写在一起，如append方法一样。
        // 链式编程
        builder.append("Lil").append("Gaage").append(true).append(21);
        System.out.println(builder);
        // 备注：StringBuilder已经覆盖重写了Object当中的toString方法。

        // 通过toString方法，StringBuilder对象将会转换为不可变的String对象
        // 链式创建
        StringBuilder stringBuilder = new StringBuilder("Lil").append("Gaage").append(true).append(21);
        // 调用toString方法
        String str = stringBuilder.toString();
        System.out.println(str); // LilGaagetrue21
    }
}
