package IOStream.Change;

import java.io.*;

public class Test {
    // 将GBK编码的文本文件，转换为UTF-8编码的文本文件。
    public static void main(String[] args) throws IOException{
        String fileName = "Study\\src\\IOStream\\Change\\utf8.txt";
        String fileName2 = "Study\\src\\IOStream\\Change\\gbk.txt";
        InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(fileName2), "GBK");

        int read;
        while ((read = isr.read()) != -1) {
            osw.write(read);
        }
        osw.close();
        isr.close();

    }
}
