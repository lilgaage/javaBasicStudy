package Method;

public class MethodTest {


    //返回值类型，必须要和 return 语句返回的类型相同，否则编译失败 。

    public static void main(String[] args){
        //调用比较方法---有参有返回值
        boolean bool = equal(4 ,5);
        System.out.println(bool);

        //调用1-100加法器---无参有返回值
        System.out.println(sum()); //不能用输出语句调用 void 类型的方法。因为方法执行后没有结果，也就打印不出任何内容

        //调用打印次数---有参无返回值
        print(5);

    }

    //比较两个整数是否相同
    public static boolean equal(int a ,int b){
        if (a == b){
            return true;
        }else {
            return false;
        }
    }


    //计算1+2+。。。+100的值
    public static int sum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        return sum;
    }


    //不定次数打印
        //没有返回值，用void类型
    public static void print(int c){
        for (int i = 0; i <= c; i++){
            System.out.println("第"+i+"次输出"+"lilgaage");
        }
    }

    //不能在 return 后面写代码， return 意味着方法结束，所有后面的代码永远不会执行，属于无效代码。
    public static int getSum(int a,int b) {
        return a + b;
//        System.out.println("Hello");// 错误，return已经结束，这里不会执行，无效代码
    }
}
