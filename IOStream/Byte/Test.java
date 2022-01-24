package IOStream.Byte;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    // 从已有文件a中读取字节，将该字节写出到另一个文件b中
    public static void main(String[] args) throws IOException {

        // 数据源
        FileInputStream fis = new FileInputStream("Study\\src\\IOStream\\Byte\\a.txt");
        // 目的地
        File file = new File("Study\\src\\IOStream\\Byte\\b.txt");
        FileOutputStream fos = new FileOutputStream(file);
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) { // read(byte[] b)
            fos.write(bytes, 0, len);
        }
        // 先开后关、后开先关
        fos.close();
        fis.close();
    }
}
