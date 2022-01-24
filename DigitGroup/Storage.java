package DigitGroup;

public class Storage {
    /*
    JVM的内存划分：
         区域名称                    作用
          寄存器           给CPU使用，和我们开发无关。
        本地方法栈          JVM在使用操作系统功能的时候使用，和我们开发无关。
          方法区           存储可以运行的class文件。
          堆内存           存储对象或者数组，new来创建的，都存储在堆内存。
          方法栈           方法运行时使用的内存，比如main方法运行，进入方法栈中执行
     */
    public static void main(String[] args){
        //数组在内存中的存储
        /*
            程序执行流程：
                1.main方法进入方法栈执行
                2.创建数组，JVM会在堆内存中开辟空间，存储数组
                3.数组在内存中会有自己的内存地址，以十六进制数表示
                4.数组中有3个元素，默认值为0
                5.JVM将数组的内存地址赋值给引用类型变量arr1
                6.变量arr1保存的是数组内存中的地址，而不是一个具体数值，因此称为引用数据类型
         */

        //一个数组
        int[] arr1 = new int[3];
        System.out.println(arr1); //[I@4554617c。是数组在内存中的地址
        System.out.println(arr1[0]);//0。输出arr保存的内存地址中数组中0索引上的元素
        //new出来的内容都是在堆内存上存储的，而方法中的变量arr1保存的是数组的地址

        //两个数组
        int[] arr2 = new int[3];
        int[] arr3 = new int[5];
        System.out.println(arr2);
        System.out.println(arr3);

        //两个变量指向一个数组
        //定义一个数组，存储3个元素
        int[] arr4 = new int[3];
        arr4[0] = 1;
        arr4[1] = 2;
        arr4[2] = 3;
        //输出三个索引上的元素值
        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);
        //定义数组变量arr5，将arr4的地址赋值给arr5
        int[] arr5 = arr4;
        arr5[1] = 9;
        System.out.println(arr4[1]);
    }

}
