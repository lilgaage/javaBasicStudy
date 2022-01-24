package CommonAPI.Scanner;

import java.util.Scanner;

public class ScannerAPI {
        /*
        Scanner类是一个可以解析基本类型和字符串的简单文本扫描器。
         */
    //例如，以下代码使用户能够从System.in中读取一个数：
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //System.in 系统输入指的是通过键盘录入数据
        System.out.println("请录入一个整数：");
        int i = sc.nextInt();
        System.out.println(i);
    }

}
