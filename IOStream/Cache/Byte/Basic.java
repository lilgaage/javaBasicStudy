package IOStream.Cache.Byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Basic {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try(FileInputStream fis = new FileInputStream("D:\\aliyun\\aDrive.exe");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\lilgaage\\Desktop\\测试\\copy.exe");
            ) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("普通流复制时间" + (end - start) + "毫秒"); // 普通流复制时间682653毫秒
    }
}
