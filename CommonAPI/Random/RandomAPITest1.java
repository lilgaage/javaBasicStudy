package CommonAPI.Random;

import java.util.Random;
import java.util.Scanner;

public class RandomAPITest1 {
    public static void main(String[] args){
        //游戏开始时，会随机生成一个1-100之间的整数 number 。
        // 玩家猜测一个数字 guessNumber ，会与 number 作比较，系统提示大了或者小了，直到玩家猜中，游戏结束。
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个数字：");
            int guessNumber =  scanner.nextInt();
            if (number > guessNumber){
                System.out.println("您猜的数字小了，请继续");
            }else if (number < guessNumber){
                System.out.println("您猜的数字大了，请继续");
            }else {
                System.out.println("恭喜您，猜中了！");
                break;
            }
        }








    }
}
