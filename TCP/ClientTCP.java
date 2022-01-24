package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端发送数据");
        // 1.创建Socket（ip，port），确定连接到哪里
        Socket client = new Socket("127.0.0.1", 6666);
        // 2.获取流对象，输出流
        OutputStream os = client.getOutputStream();
        // 3.写出数据
        os.write("服务端你好啊，客户端我来了".getBytes());

        System.out.println("=======解析回写=======");
        // 4.通过socket获取输入流对象
        InputStream ins = client.getInputStream();
        // 5.读取回写数据
        byte[] bytes = new byte[1024];
        int len = ins.read(bytes);
        System.out.println(new String(bytes, 0, len));

        // 6.关闭资源
        ins.close();
        os.close();
        client.close();
    }
}
