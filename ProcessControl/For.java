package ProcessControl;

public class For {
    public static void main(String[] args){
        //输出十次名字
        for (int i = 1; i <= 10; i++){
            System.out.println("第"+i+"次输出"+"lilgaage");
        }


        //计算1-100之间的偶数和
        int sum = 0;
        for (int a = 1; a <= 100; a++){
            if (a % 2 == 0){
                sum += a;
            }
        }
        System.out.println("1-100偶数和为："+sum);


        //打印三角形
        for (int n = 0 ; n < 5; n++){
            for (int k = 5; k >= n; k--){
                System.out.print(" ");
            }
            for (int j = 0; j <= n ; j++){
                //不换行输出*号
                System.out.print("*");
            }
            for (int m = 0; m < n; m++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
