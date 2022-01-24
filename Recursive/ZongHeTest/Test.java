package Recursive.ZongHeTest;

import java.io.File;

public class Test {
    /**
     *  搜索 D:\aaa 目录中的 .java 文件。
     *  分析：
     *      1. 目录搜索，无法判断多少级目录，所以使用递归，遍历所有目录。
     *      2. 遍历目录时，获取的子文件，通过文件名称，判断是否符合条件。
     */
    public static void main(String[] args) {
        File dir = new File("Study\\src");
        searchJava(dir);

    }
    private static void searchJava(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                if (f.getName().endsWith(".java")) {
                    System.out.println(f.getAbsolutePath());
                }
            } else {
                searchJava(f);
            }
        }
    }
}
