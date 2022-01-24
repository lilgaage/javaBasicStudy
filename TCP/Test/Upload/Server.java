package TCP.Test.Upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动");
        ServerSocket ss = new ServerSocket(6666);
        // 循环问题：服务端保存一个文件就关闭了，之后的用户无法再上传是不符合实际的，使用循环改进，可以不断接受不同用户的文件
        while (true) { // 循环接受 建立连接
            Socket server = ss.accept();
            // 效率问题：服务端在接受大文件时，可能耗费几秒钟的实际，此时不能接受其他用户上传，所以使用多线程技术优化
            new Thread(() -> { // socket对象交给子线程去处理，进行读写操作
                try {
                    // 获取输入流 读取文件数据
                    BufferedInputStream bis = new BufferedInputStream(server.getInputStream());
                    // 创建输出流 保存到本地
                    // 文件名称写死问题：保存文件的名称如果写死，那么最终导致服务器硬盘只会保留一个文件，所以使用系统时间优化，保证文件名唯一
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\lilgaage\\Desktop\\测试\\" + System.currentTimeMillis() + ".jpg"));
                    // 读写数据
                    int len;
                    byte[] bytes = new byte[8 * 1024];
                    while ((len = bis.read(bytes)) != -1) {
                        bos.write(bytes, 0, len);
                    }

                    // =============信息回写=========
                    System.out.println("back....");
                    OutputStream out = server.getOutputStream();
                    out.write("上传成功".getBytes());

                    out.close();
                    bos.close();
                    bis.close();
                    server.close();
                    System.out.println("文件上传已保存");

                } catch (IOException e) {
                    e.getStackTrace();
                }
            }).start();
        }
    }
}
