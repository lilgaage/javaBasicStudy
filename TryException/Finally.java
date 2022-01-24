package ExceptionTry;

import java.io.FileNotFoundException;

public class Finally {
    /*
    finally代码块

    finally：有一些特定的代码无论异常是否发生，都需要执行。另外，因为异常会引发程序跳转，导致有些语句执行不到。
        而finally就是解决这个问题的，在finally代码块中存放的代码都是一定会被执行的。

    什么时候的代码必须最终执行？
        当在try语句块中打开了一些物理资源（磁盘文件/网络连接/数据库连接等），
        都得在使用完之后，最终关闭打开的资源。

    try...catch...finally：自身需要处理异常，最终还得关闭资源。
    finally不能单独使用。
     */

    // 打开了一个关联文件的资源，不管程序结果如何，都需要关闭这个资源
    public static void main(String[] args) {
        try {
            read("b.txt");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("不管怎样都执行");
        }
    }
    public static void read(String path) throws FileNotFoundException {
        if (! path.equals("a.txt")) {
            throw new FileNotFoundException("文件不存在");
        }
    }
    // 当只有在try或者catch中调用退出jvm的相关方法，此时finally才不会执行，否则finally永远执行。
}
