package Recursive.ZongHeTest;

import java.io.File;
import java.io.FileFilter;

public class FileFilterGood {
    /**
     *  java.io.FileFilter是一个接口，File的过滤器
     *  该接口的对象可以传递给File类的listFiles(FileFilter)作为参数，接口中只有一个方法
     *      boolean accept(File pathname) 测试pathname是否应该包含在当前File目录中，符合返回true
     *
     *  分析：
     *      1.接口作为参数，需要传递子类对象，重写其中方法。选择你们内部类方法比较简单
     *      2.accept方法，参数为File，表示当前File下所有的子文件和子目录。
     *          保留住则返回true，过滤掉则返回false。保留规则：
     *              1.要么是.java文件
     *              2.要么是目录，用于继续遍历
     *      3.通过过滤器的作用，listFiles(FileFilter)返回的数组元素中，
     *          子文件对象都是符合条件的，可以直接打印
     */
    public static void main(String[] args) {
        File dir = new File("Study\\src");
        searchJava(dir);
    }
    private static void searchJava(File dir) {
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java") || pathname.isDirectory();
            }
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
