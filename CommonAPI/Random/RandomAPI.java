package CommonAPI.Random;

import java.util.Random;

public class RandomAPI {
    /*
    查看类
        java.util.Random; 导包
    查看构造方法
        public Random() 创建一个新的随机生成器
    查看成员方法
        public int nextInt(int n) 返回一个伪随机数，范围在0和n之间
     */
    public static void main(String[] args){
        //创建键盘录入数据的对象
        Random r = new Random();
        //随机输出三个10以内的整数
        for (int i = 0; i < 3; i++){
            int number = r.nextInt(10);
            System.out.println(number);
        }
    }
}
