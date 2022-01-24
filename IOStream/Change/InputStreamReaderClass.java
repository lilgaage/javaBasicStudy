package IOStream.Change;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderClass {
    /**
     *  转换流java.io.InputStreamReader，是Reader的子类，是从字节流到字符流的桥梁。
     *  它读取字节，并使用指定的字符集将其解码为字符。
     *  它的字符集可以由名称指定，也可以接收平台的默认字符集
     *  构造方法：
     *      InputStreamReader(InputStream in) 创建一个使用默认字符集的字符流
     *      InputStreamReader(InputStream in, String charsetName) 创建一个指定字符集的字符流
     */
    public static void main(String[] args) throws IOException {
        String FileName = "C:\\Users\\lilgaage\\Desktop\\lilgaage\\file_gbk.txt";
        // 创建流对象 默认utf-8编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(FileName));
        // 创建流对象 指定gbk编码
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream(FileName), "GBK");
        int read;
        while ((read = isr.read()) != -1) {
            System.out.print((char) read); // ʧ��ɳ��
        }
        isr.close();
        while ((read = isr2.read()) != -1) {
            System.out.print((char) read); // 失落沙洲
        }
        isr2.close();
    }
}
