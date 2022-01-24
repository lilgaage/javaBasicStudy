package IOStream.Cache.Byte;

import java.io.*;

public class Buffered {
    /**
     *  字节缓冲流
     *  构造方法：
     *     public BufferedInputStream(InputStream in) 创建一个新的缓存输入流
     *     public BufferedOutputStream(OutputStream out) 创建一个新的缓冲输出流
     */
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try(
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\aliyun\\aDrive.exe"));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lilgaage\\Desktop\\测试\\copy.exe"));
                ) {
            int b;
            while ((b = bis.read()) != -1) {
                bos.write(b);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制时间" + (end - start) + "毫秒"); // 缓冲流复制时间801毫秒
    }
}
