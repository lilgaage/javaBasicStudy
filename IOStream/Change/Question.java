package IOStream.Change;

import java.io.FileReader;
import java.io.IOException;

public class Question {
    /**
     *  编码引出的问题：
     *      在idea中，使用FileReader读取项目中的文本文件。由于idea的设置，都是默认的utf-8编码，
     *      所以没有任何问题。但是，当读取win系统中创建的文本文件时，由于编码是gbk，就会出现乱码。
     */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\lilgaage\\Desktop\\地址账号.txt");
        int read;
        while ((read = fr.read()) != -1) {
            System.out.println((char) read);
        }
        fr.close();
    }
}
