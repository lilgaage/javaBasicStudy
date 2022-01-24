package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动，等待连接");
        // 1.创建ServerSocket对象，绑定端口，开始等待连接
        ServerSocket serverSocket = new ServerSocket(6666);
        // 2.接受连接accept方法，返回socket对象
        Socket server = serverSocket.accept();
        // 3.通过socket 获取输入流
        InputStream is = server.getInputStream();
        // 4.一次性读取数据
        // 4.1创建字节数组
        byte[] bytes = new byte[1024];
        // 4.2数据读取到字节数组中
        int len = is.read(bytes);
        // 4.3解析数组，打印字符串信息
        String msg = new String(bytes, 0, len);
        System.out.println(msg);

        System.out.println("========回写数据======");
        // 5.通过socket获取输出流
        OutputStream out = server.getOutputStream();
        // 6.回写数据
        out.write("我服务端很好，谢谢你客户端".getBytes());

        // 7.关闭资源
        out.close();
        is.close();
        server.close();
    }
}
