package Main;

public class args {
    /*
    在jdk5之后，如果定义一个方法需要接收多个参数，并且多个参数类型一致，可以对其简化成如下格式：
        修饰符 返回值类型 方法名(参数类型... 形参名) {}
    其实这个书写完全等价于：
        修饰符 返回值类型 方法名(参数类型[] 形参名) {}
    只是后面这种定义，在调用时必须传递数组，而前者可以直接传递数据。

    jdk5以后，出现了简化操作  ...用在参数上，称之为可变参数
    同样是代表数组，但是在调用这个带有可变参数的方法时，不用创建数组（这就是简单之处），
    直接将数组中的元素作为实际参数进行传递，其实编译成的class文件，将这些元素先封装到一个数组中，再进行传递。
    这些动作都在编译.class文件时，自动完成了。
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = getSum(arr);
        System.out.println(sum);

        // 可变参数
        int sum2 = getSum2(3, 5, 6, 1, 234);
        System.out.println(sum2);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
    // 可变参数写法
    public static int getSum2(int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
    // 如果在书写方法时，这个方法拥有多个参数，参数中包含可变参数，可变参数一定要写在参数列表的末尾位置。
}
