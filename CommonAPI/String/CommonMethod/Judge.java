package CommonAPI.String.CommonMethod;

public class Judge {
    public static void main(String[] args) {
        // 判断功能的方法

        // 创建字符串对象
        String s1 = "lilgaage";
        String s2 = "LilGaage";
        String s3 = "LILGAAGE";

        // boolean equals(Object obj):比较字符串的内容是否相同，不忽略大小写
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals(s3)); // false

        // boolean eaualsIgnoreCase(String str):比较字符串的内容是否相同，忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println(s1.equalsIgnoreCase(s3)); // true

        //Object 是” 对象”的意思，也是一种引用类型。作为参数类型，表示任意对象都可以传递到方法中。
    }
}
