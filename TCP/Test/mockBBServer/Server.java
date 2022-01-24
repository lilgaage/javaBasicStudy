package TCP.Test.mockBBServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器启动");
        ServerSocket server = new ServerSocket(8888);
        while (true) {
            Socket socket = server.accept();
            new Thread(new Web(socket)).start();
        }
    }
    private static class Web implements Runnable {
        private Socket socket;

        public Web(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                // 转换流读取浏览器的请求信息
                BufferedReader readWb = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String request = readWb.readLine();
                // 取出请求资源的路径
                String[] strArr = request.split(" ");
                System.out.println(Arrays.toString(strArr));
                // 去掉web前面的/
                String path = strArr[1].substring(1);
                System.out.println(path);
                // 读取客户端请求的资源文件
                FileInputStream fis = new FileInputStream(path);
                System.out.println(fis);
                byte[] bytes = new byte[1024];
                int len = 0;
                // 字节输出流 将文件写回客户端
                OutputStream out = socket.getOutputStream();
                // 写入http协议响应头，固定写法
                out.write("HTTP/1.1 200 OK\r\n".getBytes());
                out.write("Content-Type:text/html\r\n".getBytes());
                // 必须写入空行，否则浏览器不解析
                out.write("\r\n".getBytes());
                while ((len = fis.read(bytes)) != -1) {
                    out.write(bytes, 0, len);
                }
                fis.close();
                out.close();
                readWb.close();
                socket.close();
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }
}
