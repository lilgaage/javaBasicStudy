package Method;

public class Method {
    public static void main(String[] args){
        //调用打印三角形的方法
        print_sanjiao();


        //调用计算两个整数的方法（带参带返回值）
        int sum = getSum(4, 8);
        System.out.println(sum);
        System.out.println(getSum(4,7));

    }


    //定义方法格式：
        //修饰符 返回值类型 方法名(参数列表){
            //代码省略...
            //return 结果;
        //}
    //修饰符： public static 固定写法
    //返回值类型： 表示方法运行的结果的数据类型，方法执行后将结果返回到调用者
    //参数列表：方法在运算过程中的未知数据，调用者调用方法时传递
    //return：将方法执行后的结果带给调用者，方法执行到 return ，整体方法运行结束
    //小贴士：return 结果; 这里的"结果"在开发中，我们正确的叫法成为方法的返回值


    //定义一个打印三角形的方法
    //print_sanjiao方法被 main 方法调用后直接输出结果，而 main 方法并不需要 print 方法的执行结果，所以被定义为void
    private static void print_sanjiao(){
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


    //定义方法的两个明确：
        //明确返回值类型
        //明确参数列表

    //需求：定义方法实现两个整数的求和计算
        //定义计算两个整数和的方法
        //返回值类型，计算结果是int
     //参数：不确定数据求和，定义int参数.参数又称为形式参数
    public static int getSum(int a, int b){
        return a + b;
    }
}
