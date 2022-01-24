package IOStream.Byte.OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamConstructor {
    /**
     *  FileOutputStream类是文件输出流，用于将数据写出到文件。
     *  是OutputStream的子类，
     *  构造方法：
     *      public FileOutputStream(File file) 创建文件输出流以写入由指定的File对象表示的文件
     *      public FileOutputStream(String name) 创建文件输出流以指定的名称写入文件
     *  当创建一个流对象时，必须传入一个文件路径。该路径下，如果没有这个文件，会创建该文件。
     *  如果有这个文件，会清空这个文件的数据。
     */
    public static void main(String[] args) throws IOException {
        // 使用File对象创建流对象
        File file = new File("Study\\src\\IOStream\\Byte\\OutputStream\\a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        // 使用文件名创建流对象
        FileOutputStream fos1 = new FileOutputStream("Study\\src\\IOStream\\Byte\\OutputStream\\b.txt");

        // 写出字节write(int b)，每次可以写出一个字节数据
        fos.write(97);
        fos.write(98);
        // 虽然参数为int类型四个字节，但只会保留一个字节的信息写出。
        // 流操作完毕必须释放系统资源，close()


        // 写出字节数组
        byte[] bytes = "李张格".getBytes(); // 字符串转换为字节数组
        fos.write(bytes);


        // 写出指定长度字节数组
        byte[] bytes1 = "LilGaage".getBytes();
        fos.write(bytes1, 3, 5); // 从索引3开始写5个字节，也就是Gaage
        fos.close();


        // 数据追加续写
        /**
         *  public FileOutputStream(File file, boolean append)
         *      创建文件输出流以写入指定的File对象表示的文件
         *  public FileOutputStream(String name, boolean append)
         *      创建文件输出流以指定的名称写入文件
         *  这两个构造方法，参数中都需要传入一个boolean类型的值，true表示追加数据，false表示清空原有数据。
         *  这样创建的输出流对象，就可以指定是否追加续写了
         */
        FileOutputStream fos3 = new FileOutputStream("Study\\src\\IOStream\\OutputStream\\c.txt", true);
        fos3.write(12);
        fos3.write("王小琳".getBytes());


        // 写出换行 \r回到一行的开头return \n下一行newline
        /**
         *  Windows中，每行结尾是回车+换行，即\r\n
         *  Unix中，每行结尾只有换行，即\n
         *  Mac系统中，每行结尾是回车，即\r。从Mac OS X开始与Linux一致
         */
        byte[] words = {1, 2, 3, 4, 5, 6, 9, 64, 34};
        for (int i = 0; i < words.length; i++) {
            fos3.write(words[i]);
            fos3.write("\r\n".getBytes());
        }
        fos3.close();
    }
}
