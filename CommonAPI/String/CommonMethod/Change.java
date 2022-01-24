package CommonAPI.String.CommonMethod;

import java.nio.charset.StandardCharsets;

public class Change {
    public static void main(String[] args) {
        // 创建字符串对象
        String s = "lilgaage";

        // char[] toCharArray():把字符串转换为字符数组
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++){
            System.out.println(chs[i]);
        }

        // byte[] getBytes():把字符串转换为字节数组
        byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }

        // 替换小写字母lg为大写LG
        String replace = s.replace("lilg", "LilG");
        System.out.println(replace);

        //CharSequence 是一个接口，也是一种引用类型。作为参数类型，可以把String对象传递到方法中。




    }
}
