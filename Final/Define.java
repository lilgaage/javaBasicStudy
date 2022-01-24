package Final;

public class Define {
    /*
    为了避免随意改写的情况，java提供了final关键字，用于修饰不可改变的内容。

    final：不可改变。用于修饰类、方法、变量
        类：被修饰的类，不能被继承
        方法：被修饰的方法，不能被重写
        变量：被修饰的变量，不能被重新赋值

    使用方式：
        修饰类：
            final class 类名 {
            } // 查询API发现，像public final class String\public final class Math等都是被final修饰的
              // 目的就是供使用，而不改变其内容

        修饰方法：
            修饰符 final 返回值类型 方法名(参数列表) {
                // 方法体
            } // 重写被final修饰的方法，编译时就会报错

        修饰变量：
     */
    public static void main(String[] args) {

        // 1.局部变量---基本类型
            // 基本类型的局部变量，被final修饰后，只能赋值一次，不能再更改。
        final int a;
        a = 10;
//        a = 20; // 报错，不可重新赋值
        final int b = 10;
//        b = 20; // 报错，不可重新赋值


        // 2.局部变量---引用类型
            // 引用类型的局部变量，被final修饰后，只能指向一个对象，地址不能再更改
            // 但不影响对象内部的成员变量值的修改。
        final User user = new User();
        // 创建另一个define对象
//        user = new Define(); // 报错，指向了新的对象，地址值被改变
        user.setName("张三"); // 可以修改成员变量值
        System.out.println(user.getName());

    }
    // 3.成员变量
    // 成员变量涉及到初始化的问题，初始化方式有两种，只能二选一
    // 3.1显示初始化
    final String USERNAME1 = "小琳"; // 被final修饰的常量名称，一般都有书写规范，所有字母都大写
    private int age1;
    // 3.2构造方法初始化
    final String USERNAME2;
    private int age2;
    public Define(String username, int age) {
        this.USERNAME2 = username;
        this.age2 = age;
    }
}
