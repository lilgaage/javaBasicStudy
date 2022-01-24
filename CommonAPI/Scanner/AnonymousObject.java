package CommonAPI.Scanner;

import java.util.Scanner;

public class AnonymousObject {
    public static void main(String[] args){
        /*
        创建对象时，只有创建对象的语句，却没有把对象地址值赋值给某个变量。虽然是创建对象的简化写法，但是应用场景非常有限。
        匿名对象：没有变量名的对象
        */
        //格式：new 类名(参数列表);
        new Scanner(System.in);

        //应用场景
        //1.创建匿名对象直接调用方法，没有变量名
        new Scanner(System.in).nextInt();

        //2.一旦调用两次方法，就是创建了两个对象，造成浪费
        new Scanner(System.in).nextInt();
        new Scanner(System.in).nextInt();
        //一个匿名对象只能使用一次

    }
}
