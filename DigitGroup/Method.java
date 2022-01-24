package DigitGroup;

public class Method {
    public static void main(String[] args){
        //数组作为方法参数传递，传递的参数是数组内存的地址
        int[] arr = {1, 3, 5, 7, 9};
        //调用方法，传递数组
        printArray(arr);


        //数组作为方法返回值，返回的是数组的内存地址
        //调用方法，接收数组的返回值
        int[] arr1 = getArray();
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }


        //方法的参数类型区别
            //方法的参数为基本类型时，传递的是数据值
            //方法的参数为引用类型时，传递的是地址值
        int a = 1;
        int b = 2;
        System.out.println(a); //1
        System.out.println(b); //2
        change(a, b);
        System.out.println(a); //1
        System.out.println(b); //2

        int[] arr3 = {1, 3, 5};
        System.out.println(arr3[0]); //1
        change(arr3);
        System.out.println(arr3[0]); //200

    }

    //创建方法，接收数组类型的参数，进行数组的遍历
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    //创建方法，返回值是数组类型
    public static int[] getArray(){
        int[] arr1 = {9, 8, 7, 6, 5, 4};
        return arr1;
    }


    public static void change(int a ,int b){
        a = a + b;
        b = b + a;
    }

    public static void change(int[] arr3){
        arr3[0] = 200;
    }
}
