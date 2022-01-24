package CommonAPI.String.CommonMethod;

public class Get {
    public static void main(String[] args) {
        // 创建字符串对象
        String s = "LilGaage";

        // int length():获取字符串长度
        System.out.println(s.length());

        // String concat(String str):将指定的字符串连接到该字符串的末尾
        String s1 = s.concat("*hello");
        System.out.println(s1);

        // char charAt(int index):获取指定索引处的字符
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));

        // int indexOf(String str):获取str在字符串对象中第一次出现的索引，没有返回-1
        System.out.println(s.indexOf("l")); // 2
        System.out.println(s.indexOf("aag")); // 4
        System.out.println(s.indexOf("o")); // -1

        // String substring(int start):从start开始截取字符串到字符串结尾
        System.out.println(s.substring(1)); // ilGaage
        System.out.println(s.substring(5)); // age

        // String substring(int start, int end):从start到end截取字符串。包头不包尾
        System.out.println(s.substring(0, s.length())); // LilGaage
        System.out.println(s.substring(3, 8)); // Gaage
    }
}
