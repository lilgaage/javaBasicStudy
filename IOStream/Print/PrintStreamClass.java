package IOStream.Print;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamClass {
    /**
     *  构造方法：
     *      public PrintStream(String fileName) ：使用指定的文件名穿甲一个新的打印流
     */
    public static void main(String[] args) throws IOException {
        System.out.println(97); // 调用系统的打印流，控制台直接输出97
        // 创建打印流，指定文件名称
        PrintStream ps = new PrintStream("Study\\src\\IOStream\\Print\\ps.txt");
        System.setOut(ps); // 设置系统的打印流流向，输出到ps.txt
        System.out.println(97); // 调用系统的打印流，ps.txt中输出97
    }
}
