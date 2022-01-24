package IOStream.Cache.Byte;

import java.io.*;

public class BufferedArray {
    // 使用数组的方式会更快
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\aliyun\\aDrive.exe"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lilgaage\\Desktop\\测试\\copy.exe"));
                ) {
            int len;
            byte[] bytes = new byte[8 * 1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("缓冲流使用数组复制时间" + (end - start) + "毫秒"); // 缓冲流使用数组复制时间155毫秒
    }
}
