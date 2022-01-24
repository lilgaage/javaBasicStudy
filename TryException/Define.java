package ExceptionTry;

public class Define {
    /*
    异常：程序在执行过程中，出现的非正常情况，导致JVM非正常停止。
    在java等面向对象的编程语言中，异常本身是一个类，产生异常就是创建异常对象并抛出了一个异常对象。
    java处理异常的方式是中断处理。
    异常并不是语法错误，语法错误编译不会通过，不会产生字节码文件，根本不能运行。

     异常机制是帮助我们找到程序中的问题。异常的根类是java.lang.Throwable,
     其下有两个子类：java.lang.Error和java.lang.Exception，平时所说的异常为Wxception

     Throwable体系：
        Error：严重错误，无法通过处理的错误，只能事先避免，好比绝症。
        Exception：表示异常，异常产生后可以通过代码的方式纠正，使程序继续运行，是必须要处理的。好比感冒、阑尾炎。
    Throwable常用方法：
        public void printStackTrace() ：打印异常的详细信息
            包含了异常的类型、原因、出现的位置。再开发和调试阶段都得使用printStackTrace
        public String getMessage() ：获取发送异常的原因
            提示给用户的时候，就提示错误原因
        public String toString() :获取异常的类型和异常描述信息（不用）

    异常（Exception）的分类：
        编译时期异常：checked异常。在编译时期，就会检查，如果没有处理异常，则编译失败（如日期格式化异常）
        运行时期异常：runtime异常。在运行时期，检查异常。在编译时期，运行异常不会编译器检测（不报错），如数学异常

     */
    public static int getElement(int[] arr, int index) {
        int element = arr[index];
        return element;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int num = getElement(arr, 4);
        System.out.println(num);
        // 运行结果：
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        //	at ExceptionTry.Define.getElement(Define.java:29)
        //	at ExceptionTry.Define.main(Define.java:35)
        /*
         由于没有找到4索引，导致运行发生了异常，这个异常jvm认识。
         ArrayIndexOutOfBoundsException这个异常本身有描述，包括名称、内容、产生位置。
         java将这些信息直接封装到异常对象中。 new ArrayIndexOutOfBoundsException: 4;
         main()方法接收到了数组索引越界异常对象。
         由于main方法并没有处理异常，main()方法就会继续把异常抛给调用者jvm。
         当jvm收到异常后，将异常对象中的名称、内容、位置显示在屏幕上。
         同时，让程序立刻终止。
         */
    }
    /* 异常注意事项：
        1.多异常捕获处理：
            --1，多个异常分别处理
            --2，多个异常一次捕获，多次处理
            --3，多个异常一次捕获一次处理
            一般使用一次捕获多次处理方式：
                try{
                    编写可能会出现异常的代码
                } catch(异常类型A e) { // 当try中出现A类型异常，就该用catch来捕获
                    处理异常的代码
                    // 记录日志/打印异常信息/继续抛出异常
                } catch(异常类型B e) { // 当try中出现B类型异常，就该用catch来捕获
                    处理异常的代码
                    // 记录日志/打印异常信息/继续抛出异常
                }
            这种异常处理方式，要求多个catch中的异常不能相同，并且若catch中的多个异常之间有子父类异常的关系，
            那么子类异常要求在上面的catch处理，父类异常在下面的catch处理。
        2.运行时异常被抛出可以不处理。即不捕获也不声明抛出
        3.如果finally有return语句，永远返回finally中的结果，避免该情况
        4.如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出异常
        5.父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常。此时子类产生该异常只能捕获处理，不能声明抛出。
     */

}
