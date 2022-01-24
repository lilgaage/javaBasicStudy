package IOStream.Byte.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamConstructor {
    /**
     *  java.io.FileInputStream类是文件输入流，从文件中读取字节。
     *  构造方法：
     *      FileInputStream(File file) 通过打开与实际文件的连接来创建一个FileInputStream，
     *          该文件优文件系统中的File对象file命名
     *      FileInputStream(String name) 通过打开与实际文件的连接来创建一个FileInputStream，
     *          该文件由文件系统中的路径名name命名。
     *  当创建一个流对象时，必须传入一个文件路径。该路径下如果没有该文件，会抛出FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("Study\\src\\IOStream\\Byte\\InputStream\\a.txt");
        FileInputStream fis = new FileInputStream(file);

        FileInputStream fis2 = new FileInputStream("Study\\src\\IOStream\\Byte\\InputStream\\b.txt");

        // 读取字节数据 read(), 每次可以读取一个字节的数据，提升为int类型，读取到文件末尾，返回-1
//        int read = fis.read();
//        System.out.println((char) read);
//        read = fis.read();
//        System.out.println((char) read);
//        read = fis.read();
//        System.out.println((char) read);
//        System.out.println(fis.read()); // 读到末尾，返回-1
        // 使用循环读取
        int read; // 必须定义变量保存数据
        while ((read = fis.read()) != -1) {
            System.out.println((char) read);
        }
        fis.close();

        // 使用字节数组读取read(byte[] b) ，每次读取b的长度个字节到数组中，返回读取到的有效字节数，
        // 读取到末尾时，返回-1
        int len;
        byte[] bytes = new byte[2]; // 定义字节数组，作为装字节数据的容器
        while ((len = fis2.read(bytes)) != -1) {
            System.out.println(new String(bytes)); // 读取后，把数组变为字符串打印
         // 输出结果为ab cd ed
        // 由于最后一次读取，制度器一个字节e，数组中，上次读取的数据没有被完全替换，
        // 所以要通过len，获取有效的字节
            System.out.println(new String(bytes, 0, len)); // len 每次读取的有效字节数
        } // 输出结果ab cd e
        fis2.close();
        // 使用数组读取，每次读取多个字节，减少了系统间的IO操作次数，提高读写效率，推荐使用
    }
}
