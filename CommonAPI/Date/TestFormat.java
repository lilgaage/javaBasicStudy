package CommonAPI.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestFormat {
    // 计算一个人出生了多少天
    public static void main(String[] args) throws ParseException {
        Date today = new Date();
        System.out.println("请输入自己的出生日期：");
        String birthday = new Scanner(System.in).next();
        // 创建日期对象，写日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 调用parse方法，将字符串转为日期
        Date birthdayDate = sdf.parse(birthday); // java.text.ParseException; 必须对其进行捕获或声明以便抛出
        // 将两个日期转换为毫秒值
        long birthdatSecond = birthdayDate.getTime();
        long todaySecond = today.getTime();
        long sencond = todaySecond - birthdatSecond;
        if (sencond < 0) {
            System.out.println("我还没出生呢姐姐");
        } else {
            System.out.println(sencond / 1000 / 60 / 60 / 24);
        }

    }
}
