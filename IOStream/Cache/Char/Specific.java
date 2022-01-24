package IOStream.Cache.Char;

import java.io.*;

public class Specific {
    /**
     *  字符缓冲流
     *  构造方法：
     *      public BufferedReader(Reader in) 创建一个新的缓冲输入流
     *      public BufferedWriter(Writer out) 创建一个新的缓冲输出流
     *  特有方法：
     *      BufferedReader：public String readLine() 读一行文字
     *      BufferedWriter：public void newLine() 其实就是换行  （写一行 行分隔符，由系统属性定义符号）
     */
    public static void main(String[] args) throws IOException {
        // 读一行文字
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lilgaage\\Desktop\\地址账号.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            System.out.println("------");
        }
        br.close();

        // 写一行分隔
        BufferedWriter bw = new BufferedWriter(new FileWriter("Study\\src\\IOStream\\Cache\\Char\\write.txt"));
        bw.write("李张格");
        bw.newLine(); // 下一行
        bw.write("LilGaage");
        bw.newLine();
        bw.close();
    }
}
