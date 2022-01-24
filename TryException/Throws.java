package ExceptionTry;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws {
    /*
    声明异常throws
    声明异常：将问题标识出来，报给给调用者。如果方法内通过throw抛出了编译时异常，
    而没有进行捕获处理，那么必须通过throws进行声明，让调用者去处理。

    关键字throws运用于方法声明之上，用于表示当前方法不处理异常，而是提醒该方法的调用者来处理异常（抛出异常）

    声明异常格式：
        修饰符 返回值类型 方法名(参数) throws 异常类名1, 异常类名2, ... {}
     */
    public static void main(String[] args) throws IOException {
        read("a.txt");
    }
    public static void read(String path) throws FileNotFoundException, IOException {
        if (! path.equals("a.txt")) { // 如果不是a.txt这个文件
            throw new FileNotFoundException("该文件不存在");
        }
        if (! path.equals("b.txt")) {
            throw new IOException();
        }
    }
    // throws用于进程异常类的声明，若该方法可能有多种异常情况产生，那么在throws后面可以写多个异常类，用逗号隔开
}
