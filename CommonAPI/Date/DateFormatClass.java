package CommonAPI.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatClass {
    /*
    java.text.DateFormat是日期时间格式化子类的抽象类，
    通过这个类可以完成日期和文本之间的转换，也就是可以在String和Date对象之间进行来回转换
    格式化：按照指定的格式，从Date对象转换为String对象
    解析：按照指定的格式，从String对象转换为Date对象

    构造方法：由于DateFormat为抽象类，不能直接使用，所以需要常用的子类java.text.SimpleDateFormat.
        这个类需要一个模式（格式）来指定格式化或解析的标准。构造方法为：
        public SimpleDateFormat(String pattern):用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat
        pattern是一个字符串，代表日期时间的自定义格式

    常用方法:
        public String format(Date date)  按照指定的模式,把Date日期,格式化为符合模式的字符串
        public Date parse(String source)  把符合模式的字符串,解析为Date日期

    格式规则：（更详细的格式规则，可以参考SimpleDateFormat类的API文档）
        | y     | 年
        | M     | 月
        | d     | 日
        | H     | 时
        | m     | 分
        | s     | 秒
     */
    public static void main(String[] args) throws ParseException {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 调用parseMethod
        parseMethod();

        // 调用formatMethod()
        formatMethod();
    }


    /*
         使用DateFormat类中的方法parse,把文本解析为日期
         使用步骤:
            1.创建SimpleDateFormat对象,构造方法中传递指定的模式
            2.调用SimpleDateFormat对象中的方法parse,把符合构造方法中模式的字符串,解析为Date日期
            注意:
                public Date parse(String source) throws ParseException
                parse方法声明了一个异常叫ParseException
                如果字符串和构造方法的模式不一样,那么程序就会抛出此异常
                调用一个抛出了异常的方法,就必须的处理这个异常,要么throws继续抛出这个异常,要么try catch自己处理
     */
    private static void parseMethod() throws ParseException {
        //1.创建SimpleDateFormat对象,构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.调用SimpleDateFormat对象中的方法parse,把符合构造方法中模式的字符串,解析为Date日期
        //Date parse(String source)  把符合模式的字符串,解析为Date日期
        Date date = sdf.parse("2022-01-04 15:28:45");
        System.out.println(date); // Tue Jan 04 15:28:45 CST 2022

    }


    /*
        使用DateFormat类中的方法format,把日期格式化为文本
        使用步骤:
            1.创建SimpleDateFormat对象,构造方法中传递指定的模式
            2.调用SimpleDateFormat对象中的方法format,按照构造方法中指定的模式,把Date日期格式化为符合模式的字符串(文本)
     */
    private static void formatMethod() {
        //1.创建SimpleDateFormat对象,构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.调用SimpleDateFormat对象中的方法format,按照构造方法中指定的模式,把Date日期格式化为符合模式的字符串(文本)
        //String format(Date date)  按照指定的模式,把Date日期,格式化为符合模式的字符串
        Date date = new Date();
        String d = sdf.format(date);
        System.out.println(d); // 2022-01-04 15:35:34
        System.out.println(date); // Tue Jan 04 15:35:34 CST 2022
    }


}
