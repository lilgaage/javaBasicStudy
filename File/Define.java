package File;

import java.io.File;

public class Define {
    /**
     * java.io.File类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找、删除等操作
     * 构造方法：
     *  public File(String pathname):通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
     *  public File(String parent, String child):从父路径名字符串和子路径名字符串创建新的File实例
     *  public File(File parent, String child):从父抽象路径名和子路径名字符串创建新的File实例
     */
    String pathname = "D:\\aaa.txt";
    File file = new File(pathname);

    String pathname2 = "D:\\aaa\\bbb.txt";
    File file2 = new File(pathname2);

    String parent = "D:\\aaa";
    String child = "bbb.txt";
    File file3 = new File(parent, child);

    File parentDir = new File("D:\\aaa");
    String child2 = "bbb.txt";
    File file4 = new File(parentDir, child2);
    // 一个File对象代表硬盘中实际存在的一个文件或目录
    // 无论该路径下是否存在文件或目录，都不影响File对象的创建
}
