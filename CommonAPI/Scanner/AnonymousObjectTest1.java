package CommonAPI.Scanner;

import java.util.Scanner;

public class AnonymousObjectTest1 {
    //3.2作为返回值
    public static void main(String[] args){
        //普通方式
        Scanner sc = getScanner();

    }
    public static Scanner getScanner(){
        //普通方式
//        Scanner sc = new Scanner(System.in);
//        return sc;

        //匿名对象作为方法返回值
        return new Scanner(System.in);
    }
}
