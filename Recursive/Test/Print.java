package Recursive.Test;

import java.io.File;

public class Print {
    /**
     * 递归打印多级目录
     *  分析：
     *      遍历前，无从知道有多少级目录，所以使用递归实现
     */
    public static void main(String[] args) {
        File dir = new File("Study\\src");
        printDir(dir);
    }
    private static void printDir(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println("文件名为：" + f.getAbsolutePath());
            } else {
                System.out.println("目录名为：" + f.getAbsolutePath());
                // 继续遍历子目录
                printDir(f);
            }
        }
    }
}
