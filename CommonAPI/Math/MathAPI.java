package CommonAPI.Math;

public class MathAPI {
    /*
    java.lang.Math类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数
    类似这样的工具类，其所有方法均为静态方法，并且不会创建对象，调用起来很简单。
     */
    public static void main(String[] args) {

        // public static double abs(double a):返回double值的绝对值
        double d1 = Math.abs(-5);
        double d2 = Math.abs(5);
        // public static ceil(double a):返回大于等于参数的最小整数
        double c1 = Math.ceil(3.3);
        double c2 = Math.ceil(-3.3);
        double c3 = Math.ceil(5.1);
        // public static double floor(double a):返回小于等于参数最大的整数
        double f1 = Math.floor(3.3);
        double f2 = Math.floor(-3.3);
        double f3 = Math.floor(5.1);
        // public static long round(double a):返回最接近参数的long，四舍五入
        double l1 = Math.round(5.5);
        double l2 = Math.round(5.4);
    }
}
