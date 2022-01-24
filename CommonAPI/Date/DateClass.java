package CommonAPI.Date;

import java.util.Date;

public class DateClass {
    /*
    java.util.Date类 表示特定的瞬间，精确到毫秒
    继续查阅Date类的描述，发现Date拥有多个构造函数，只是部分已经过时，但是其中有未过时的构造函数
    public Date() ：分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）
    public Date(long date) ： 分配Date对象并初始化此对象，以表示自从标准基准时间，即1970年1余额1日以来的指定毫秒数
        简单来说，使用无参构造，可以自动设置当前系统时间的毫秒时刻；指定long类型的构造参数，可以自定义毫秒时刻。
     */
    /*
    毫秒值的作用:可以对时间和日期进行计算
    2099-01-03 到 2088-01-01 中间一共有多少天
    可以日期转换为毫秒进行计算,计算完毕,在把毫秒转换为日期

    把日期转换为毫秒:
        当前的日期:2088-01-01
        时间原点(0毫秒):1970 年 1 月 1 日 00:00:00(英国格林威治)
        就是计算当前日期到时间原点之间一共经历了多少毫秒 (3742767540068L)
    注意:
        中国属于东八区,会把时间增加8个小时
        1970 年 1 月 1 日 08:00:00

    把毫秒转换为日期:
        1 天 = 24 × 60 × 60 = 86400 秒  = 86400 x 1000 = 86400000毫秒
     */
    public static void main(String[] args) {
        // 获取当前系统时间到1970 年 1 月 1 日 00:00:00经历了多少毫秒
        System.out.println(System.currentTimeMillis());


        // long getTime() 把日期转换为毫秒值(相当于System.currentTimeMillis()方法)
        // 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        // 创建一个Date对象
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);


        // Date类的带参数构造方法 Date(long date) :传递毫秒值,把毫秒值转换为Date日期
        Date date1 = new Date(0L);
        System.out.println(date1); // Thu Jan 01 08:00:00 CST 1970
        date1 = new Date(3742767540068L);
        System.out.println(date1); // Sun Aug 08 09:39:00 CST 2088


        // Date类的空参数构造方法 Date() 获取当前系统的日期和时间
        Date date2 = new Date();
        System.out.println(date2); //Tue Jan 04 14:50:28 CST 2022

        // tips:在使用println方法时，会自动调用Date类中的toString方法。Date类对Object类中的toString方法进行了覆盖重写，所以结果为指定格式的字符串
        System.out.println(new Date()); // Tue Jan 04 14:52:36 CST 2022
        System.out.println(new Date(0L)); // Thu Jan 01 08:00:00 CST 1970


    }
}
