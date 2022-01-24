package ExceptionTry;

import java.io.FileNotFoundException;

public class TryCatch {
    /*
    如果异常出现的话，会立刻终止程序，所以得处理异常：
        1.该方法不处理，而是声明抛出，由该方法的调用者来处理throws
        2.在方法中使用try catch的语句块来处理异常
    try-catch的方式就是捕获异常。
        java中对异常有针对性的语句进行捕获，可以对出现的异常进行指定方式的处理
    格式：
        try{
            编写可能会出现异常的代码
        } catch(异常类型 e) {
            处理异常的代码
            // 记录日志/打印异常信息/继续抛出异常
        }
        try：该代码块中编写可能产生异常的代码
        catch：用来进行某种异常的捕获，实现对捕获到的异常进行处理
        try、catch必须连用。
     */
    public static void main(String[] args) {
        try {
            read("b.txt");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    public static void read(String path) throws FileNotFoundException {
        if (! path.equals("a.txt")) { // 如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常 throw
            throw new FileNotFoundException("文件不存在");
        }
    }
    // 如何获取异常信息：
        // Throwable类中定义了一些查看方法：
            // public String getMessage():获取异常的描述信息，原因（提示给用户时，就提示错误原因）
            // public String toString():获取异常的类型和异常描述信息（不用）
            // public void pringStackTrace():打印异常的跟踪栈信息并输出到控制台
}
