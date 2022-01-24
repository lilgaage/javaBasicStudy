package Method;

public class ReMethodTest {
    public static void main(String[] args){
        //方法重载：指在同一个类中，允许存在一个以上的同名方法，只要它们的参数列表不同即可，与修饰符和返
        //回值类型无关。
        //参数列表：个数不同，数据类型不同，顺序不同。
        //重载方法调用：JVM通过方法的参数列表，调用不同的方法

        //比较两个数据是否相等。参数类型分别为两个 byte 类型，两个 short 类型，两个 int 类型，两个 long 类型
        //定义不同数据类型的变量
        byte a = 1;
        byte b = 2;
        short c = 3;
        short d = 4;
        int e = 5;
        int f = 6;
        long g = 7;
        long h = 8;
        System.out.println(compare(a , b));
        System.out.println(compare(c , d));
        System.out.println(compare(e , f));
        System.out.println(compare(g , h));


        //调用 传递什么类型的数据就输出什么类型的数据
        println((byte)1);
        println('c');


    }
    public static boolean compare(byte a , byte b){
        System.out.println("byte");
        return a == b;
    }
    public static boolean compare(short c , short d){
        System.out.println("short");
        return c == d;
    }
    public static boolean compare(int e , int f){
        System.out.println("byte");
        return e == f;
    }
    public static boolean compare(long g , long h){
        System.out.println("long");
        return g == h;

    }


    //判断哪些是重载
    public static void open(){}
    public static void open(int a){}
    static void open(int a,int b){}  // 代码错误：和第52行冲突
    public static void open(double a,int b){}
    public static void open(int a,double b){} //代码错误：和第50行冲突
//    public void open(int i,double d){} //代码错误：和第49行冲突
    public static void OPEN(){}         // 代码正确不会报错，但是并不是有效重载
//    public static void open(int i,int j){} // 代码错误：和第47行冲突


    //传递什么类型的数据就输出什么类型的数据
    public static void println(byte a){
        System.out.println(a);
    }
    public static void println(char b){
        System.out.println(b);

    }


}
