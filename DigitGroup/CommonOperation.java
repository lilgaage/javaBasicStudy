package DigitGroup;

public class CommonOperation {
    public static void main(String[] args){
        //数组越界异常
        int[] arr = {1, 2, 3};
//        System.out.println(arr[3]);//数组中没有索引3。抛出异常ArrayIndexOutOfBoundsException
        //数组空指针异常
        int[] arr1 = {1, 2, 3};
        arr1 = null; //意味着变量arr1将不会在保存数组的内存地址
//        System.out.println(arr1[0]); //会抛出 NullPointerException 空指针异常

        //数组遍历
        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }

        //数组获取最大值
        int[] arr3 = {5, 15, 25, 35, 45};
        //定义变量，保存数组中0索引的元素
        int max = arr3[0];
        for (int i = 0; i < arr3.length; i++){
            if(arr3[i] > max){
                max = arr3[i];
            }
        }
        System.out.println("数组的最大值是："+ max);

        //数组反转
        /*
            数组的反转：数组中的元素颠倒顺序
            实现思想：数组最远端的元素互换位置
                1.实现反转，就需要将数组最远端元素位置交换
                2.定义两个变量，保存数组的最小索引和最大索引
                3.两个索引上的元素交换位置
                4.最小索引++，最大索引--，再次交换位置
                5.最小索引超过了最大索引，数组反转操作结束
         */
        int[] arr4 = {1, 2, 3, 4, 5};
        //循环中定义变量min=0最小索引，max=arr.length-1最大索引，min++，mmax--
        for (int min = 0, mmax = arr4.length - 1; min <= mmax; min++, mmax--){
            //利用第三方变量完成数组中的元素交换
            int temp = arr4[min];
            arr4[min] = arr4[mmax];
            arr4[mmax] = temp;
            System.out.println(arr4);
        }
        //反转后遍历数组
        for (int i = 0; i < arr4.length; i++){
            System.out.println(arr4[i]);
        }

    }


}
