package IOStream.Change;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterClass {
    /**
     *  转换流java.io.OutputStreamWriter是Writer的子类，是从字符流到字节流的桥梁
     *  使用指定的字符集将字符编码转换为字节。
     *  它的字符集可以由名称指定，也可以街火速平台默认字符集。
     *  构造方法：
     *      OutputStreamWriter(OutputStream in) 创建一个使用默认字符集的字符流
     *      OutputStreamWriter(OutputStream in, String charsetName) 创建一个指定字符集的字符流
     */
    public static void main(String[] args) throws IOException {
        String FileName = "C:\\Users\\lilgaage\\Desktop\\lilgaage\\file.txt";
        // 创建流对象 默认utf8编码
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(FileName));
        // 创建流对象 指定gbk
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream(FileName), "GBK");
        osw.write("你好");
        osw.close();
        osw2.write("你好");
        osw2.close();
    }
}
