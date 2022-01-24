package TCP.Test.Upload;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // 创建输入流 读取本地文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\lilgaage\\Desktop\\测试\\upload.jpg"));
        Socket client = new Socket("127.0.0.1", 6666);
        // 获取流对象 输出流
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());

        // 写出数据
        int len;
        byte[] bytes = new byte[8 * 1024];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
            bos.flush();
        }
        // 关闭输出流，通知服务端，写出数据完毕
        client.shutdownOutput();
        System.out.println("文件发送完毕");

        // =========解析回写=======
        InputStream is = client.getInputStream();
        byte[] back = new byte[12];
        is.read(back);
        System.out.println(new String(back));

        is.close();
        bos.close();
        client.close();
        bis.close();
        System.out.println("文件上传完毕");
    }
}
