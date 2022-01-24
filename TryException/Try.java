package ExceptionTry;

public class Try {
    /*
    java异常处理的五个关键字：try、catch、finally、throw、throws

    抛出异常throw：
        在编写程序时，必须要考虑程序出现问题的情况。比如，定义方法时，方法需要接收参数。
        那么，当调用方法使用接受到的参数时，首先需要线对参数数据进行合法的判断，数据若不合法，就应该告诉调用者，传递合法的数据进来。
        这时需要使用抛出异常的方式来告诉调用者。
        throw关键字用来抛出一个指定的异常对象：
            1.创建一个异常对象。封装一些提示信息
            2.将异常对象告诉调用者。 throw 异常对象。throw用在方法内，用来抛出一个异常对象，将这个异常对象传递到调用者处，并结束当前方法的执行。
            使用格式：
                throw new 异常类名(参数);
            例如：
                throw new NullPointerException("要访问的arr数组不存在");
                throw new ArrayIndexOutOfBoundsException("该索引在数组中不存在，已超出范围");
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 9};
        int index = 7;
        int element = getElement(arr, index);
        System.out.println(element); // Exception in thread "main" java.lang.IndexOutOfBoundsException: 下标越界了袄
    }
    public static int getElement(int[] arr, int index) {
        // 判断索引是否越界
        if (index < 0 || index > arr.length - 1) {
            throw new IndexOutOfBoundsException("下标越界了袄");
        }
        int element = arr[index];
        return element;
    }
    // 如果产生了问题，就会throw抛出异常，也就是将问题返回给该方法的调用者。
    // 对于调用者来说，一是进行捕获处理，另一种就是继续将问题声明出去，使用throws声明处理

    // Objects非空判断
    // Objects类是null-save(空指针安全的)或null-tolerant（容忍空指针）的，
    // 那么在它的源码中，对对象为null的值进行了抛出异常操作。
    // public static <T> requireNonNull(T obj) :查看指定引用对象不是null
    public static <T> T requireNonNull(T obj) {
        if (obj == null)
            throw new NullPointerException();
        return obj;
    }

}
