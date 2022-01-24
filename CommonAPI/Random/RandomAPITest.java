package CommonAPI.Random;


import java.util.Random;
import java.util.Scanner;

public class RandomAPITest {
    public static void main(String[] args){
        //获取1-n之间的随机数，包含n
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        //接收输入的整数
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            int number = r.nextInt(n) + 1; //+1输出的是1-n之间的数，包含n
            System.out.println("第" + i + "次输出的数字是：" + number);

        }

    }
}
