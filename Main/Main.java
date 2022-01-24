package Main;

public class Main {
    public static void main(String[] args){
        System.out.println("hello lilgaage");
        int i = 1;
        byte n = 2;
//        byte x = i + n;//报错
        //int类型和byte类型运算，结果应该是int类型
        int x = i + n;
        System.out.println(x);
        //转换规则：byte、short、char‐‐>int‐‐>long‐‐>float‐‐>double


        //强制转换格式：数据类型 变量名 = （数据类型）被转数据值；
        int b = (int) 1.5;
        System.out.println(b);
        short s = 1;
//        s = s + 1; //报错。java: 不兼容的类型: 从int转换到short可能会有损失
        s += 1;  //分析： s += 1 逻辑上看作是 s = s + 1 计算结果被提升为int类型，再向short类型赋值时发生错误，因为不能将取值范围
                 //大的类型赋值到取值范围小的类型。但是， s=s+1进行两次运算 ， += 是一个运算符，只运算一次，并带有强制转换的特点，
                 //也就是说 s += 1 就是 s = (short)(s + 1) ，因此程序没有问题编译通过，运行结果是2.
        s = (short) (s + 1);
        System.out.println(s);


        //浮点转成整数，直接取消小数点，可能造成数据损失精度。
        //int 强制转成 short 砍掉2个字节，可能造成数据丢失。
        short a = 32767; //定义s为short最大值32767
        a = (short) (a + 10);
        System.out.println(a); //-32759。强制转换，砍掉2个字节后会出现不确定的结果


        //运算 整数使用运算符无论怎么计算，也不会得到小数
        int c = 1234;
        System.out.println(c/1000*1000); //1000


        //三元运算符
        //格式：数据类型 变量名 = 布尔类型表达式？结果1：结果2
        //三元运算符计算方式：
            //布尔类型表达式结果是true，三元运算符整体结果为结果1，赋值给变量。
            //布尔类型表达式结果是false，三元运算符整体结果为结果2，赋值给变量。
        int lil = (1 == 2 ? 100 : 200); //200
        System.out.println(lil);
        long gaage = (1L <= 2L ? 300 : 400);
        System.out.println(gaage); //300


        //常量和变量的运算
        byte b1 = 1;
        byte b2 = 2;
        byte b3 = 1 + 2; //3。， 1 和 2 是常量，为固定不变的数据，在编译的时候（编译器javac），已经确定了 1+2 的结果并没有超过byte类型的取值范围，可以赋值给变量 b3
//        byte b4 = b1 + b2; //报错。在编译的时候，编译器javac不确定b2+b3的结果是什么，因此会将结果以int类型进行处理，所以int类型不能赋值给byte类型
        System.out.println(b3);
//        System.out.println(b4);


        //方法
            //方法必须定义在一类中方法外,类中，main方法外可以定义方法
            //方法不能定义在另一个方法的里面
        //调用定义的方法methodName
        methodName();
        //调用定义的三元运算符方法
        operator();
    }
    //定义格式：
//        修饰符 返回值类型 方法名 （参数列表）｛
//          代码...
//          return ;
//      ｝
    //定义格式解释：
//            修饰符： 目前固定写法 public static
//            返回值类型： 目前固定写法 void ，其他返回值类型在后面的课程讲解。
//            方法名：为我们定义的方法起名，满足标识符的规范，用来调用方法。
//            参数列表： 目前无参数， 带有参数的方法在后面的课程讲解。
//            return：方法结束。因为返回值类型是void，方法大括号内的return可以不写
    //自定义方法，被main方法调用
    public static void methodName() {
        System.out.println("这是一个方法");
    }
    //定义三元运算符的一个方法
    public static void operator(){
        int g = 0;
        g = (2 == 3 ? 100 : 200);
        System.out.println(g);
        int h = 0;
        h = (1 < 2 ? 300 : 400);
        System.out.println(h);
    }
}
