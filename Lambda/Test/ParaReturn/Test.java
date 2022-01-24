package Lambda.Test.ParaReturn;

public class Test {
    public static void main(String[] args) {
//        invokeCale(120, 130, (int a, int b) -> { // (int a, int b)表示calc抽象方法的参数
//            int sum = a + b;
//            return sum;
//        });

        // 省略写法
        invokeCale(120, 130, (a, b) -> a + b);
        /**
         *  省略规则：
         *      1.小括号内参数的类型可以省略
         *      2.如果小括号内有且仅有一个参，则小括号可以省略
         *      3.如果大括号有且仅有一个语句，则无论是否有返回值，都可以省略大括号
         */
    }
    private static void invokeCale(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }
}
