package CommonAPI.String;

import java.util.Scanner;

public class Test2 {
    // 键盘录入一个字符，统计字符串中大小写字母及数字字符个数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = scanner.nextLine();
        // 定义统计变量
        int BigCount = 0;
        int SmallCount = 0;
        int NumCount = 0;
        int OtherCount = 0;
        for (int i = 0; i < s.length(); i++){
            char chr = s.charAt(i); //charAt() 方法可返回指定位置的字符
            if (chr >= 'A' && chr <= 'Z'){
                BigCount++;
            } else if (chr >= 'a' && chr <= 'z'){
                SmallCount++;
            } else if (chr >= '0' && chr <= '9'){
                NumCount++;
            } else {
                OtherCount++;
            }
        }
        System.out.println("大写字母有" + BigCount + "个");
        System.out.println("小写字母有" + SmallCount + "个");
        System.out.println("数字有" + NumCount + "个");
        System.out.println("其他字符有" + OtherCount + "个");

    }

}
