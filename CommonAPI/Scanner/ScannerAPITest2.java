package CommonAPI.Scanner;
import java.util.Scanner;

public class ScannerAPITest2 {
    //键盘录入三个数据并获取最大值
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        System.out.println("请输入第三个数");
        int c = sc.nextInt();
        int max;
        if (a > b){
            max = a;
        }else if (b > c){
            max = b;
        }else max = c;
        System.out.println("最大值为：" + max);

        //获取三个数的最大值
        int temp = (a > b ? a : b);
        int m = (temp > c ? temp : c);
        System.out.println(m);


    }
}
