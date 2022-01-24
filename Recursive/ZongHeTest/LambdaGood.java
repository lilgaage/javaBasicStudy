package Recursive.ZongHeTest;

import java.io.File;

public class LambdaGood {
    // FileFilter是一个接口，所有可以用lambda表达式简写
    public static void main(String[] args) {
        File dir = new File("Study\\src");
        searchJava(dir);

    }
    private static void searchJava(File dir) {
        File[] files = dir.listFiles(pathname -> {
            return pathname.getName().endsWith(".java") || pathname.isDirectory();
        });
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getAbsolutePath());
            } else {
                searchJava(f);
            }
        }
    }
}
