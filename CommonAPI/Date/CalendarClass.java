package CommonAPI.Date;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    /*
    java.util.Calender是日历类，在Date后出现，替换掉了许多Date的方法。
    该类将所有可能用到的时间信息封装为静态成员变量，方便获取。
    日历类就是方便获取各个时间属性的。

    获取方式：
        Calender为抽象类，由于语言敏感性，Calender类在创建对象时并非直接创建，而是通过静态方法创建，返回子类对象。

    Calender静态方法：
        public static Calender getInstance():使用默认时区和语言环境获得一个日历
     */
    // Calendar类是一个抽象类,里边提供了很多操作日历字段的方法(YEAR、MONTH、DAY_OF_MONTH、HOUR )
    // Calendar类无法直接创建对象使用,里边有一个静态方法叫getInstance(),该方法返回了Calendar类的子类对象
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // 多态
        System.out.println(calendar); // java.util.GregorianCalendar[time=1641283812023,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=10,SECOND=12,MILLISECOND=23,ZONE_OFFSET=28800000,DST_OFFSET=0]


        Get();
        Set();
        Add();
        getT();
    }


    /*
    Calendar类的常用成员方法:
        public int get(int field)：返回给定日历字段的值。
        public void set(int field, int value)：将给定的日历字段设置为给定值。
        public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    成员方法的参数:
        int field:日历类的字段,可以使用Calendar类的静态成员变量获取
            public static final int YEAR = 1;	年
            public static final int MONTH = 2;	月
            public static final int DATE = 5;	月中的某一天
            public static final int DAY_OF_MONTH = 5;月中的某一天
            public static final int HOUR = 10; 		时
            public static final int MINUTE = 12; 	分
            public static final int SECOND = 13;	秒
 */
    // get方法用来获取指定字段的值 public int get(int field)：返回给定日历字段的值。
    private static void Get() {
        // 创建日历对象
        Calendar calendar = Calendar.getInstance();
        // 设置年
        int year = calendar.get(Calendar.YEAR);
        // 设置月
        int month = calendar.get(Calendar.MONTH) + 1; // 西方的月份0-11 东方:1-12
        // 设置日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日"); // 2022年1月4日
    }

    // set方法用来设置指定字段的值
    private static void Set() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 13);
        // 同时设置年月日，可以使用set的重载方法
        calendar.set(1999, 5, 20);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日"); // 2000年2月13日

    }

    // add方法可以对指定日历字段的值进行加减操作，如果第二个参数为正数则加上偏移量，如果为负数则减去偏移量
    private static void Add() {
        Calendar calendar = Calendar.getInstance();
        // 使用add方法
        calendar.add(Calendar.DAY_OF_MONTH, 2); // 加两天
        calendar.add(Calendar.MONTH, 1); // 加一月

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int date = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + day + "日" + date + "日"); // 2022年1月6日6日

    }

    // Calendar中的getTime方法并不是获取毫秒时刻，而是拿到对应的Date对象。
    // public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
    // 把日历对象,转换为日期对象
    private static void getT() {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date); // Tue Jan 04 16:46:02 CST 2022
    }
}
