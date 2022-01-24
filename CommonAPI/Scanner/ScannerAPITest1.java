package CommonAPI.Scanner;
import java.util.Scanner;

public class ScannerAPITest1 {
    public static void main(String[] args){
        //键盘录入两个数据并求和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int i = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int n = sc.nextInt();
        int sum = i + n;
        System.out.println("两数和为：" + sum);
    }
}
