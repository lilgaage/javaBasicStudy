package CommonAPI.String;

public class Define {
    /*
    java.lang.String 类代表字符串。Java程序中所有的字符串文字（例如 "abc" ）都可以被看作是实现此类的实例。
    类 String 中包括用于检查各个字符串的方法，比如用于比较字符串，搜索字符串，提取子字符串以及创建具有翻译为大写或小写的所有字符的字符串的副本。
     */
    public static void main(String[] args){
        //特点：
        //1.字符串不变：字符串的值在创建后不能被更改
        String s1 = "adc";
        s1 += "d";
        System.out.println(s1); //adcd
        // 内存中有"abc"，"abcd"两个对象，s1从指向"abc"，改变指向，指向了"abcd"

        //2.因为String对象是不可变的，所以可以被共享
        String s2 = "abc";
        String s3 = "abc";
        // 内存中只有一个“abc”对象被创建，同时被s1和s2共享

        //3."abc"等效于 char[] data = { 'a', 'b', 'c' }
//        String str = "abc";
        char data[] = { 'a', 'b', 'c'};
        String str = new String(data);
        System.out.println(str);
        // String底层是靠字符数组实现的


        /*
        查看类
            java.lang.String:该类不需要导入
        查看构造方法
            public String():初始化新建的String对象，以使其表示空字符序列
            public String(char[] value):通过当前参数中的字符数组来构造新的String
            public String(byte[] bytes):通过使用平台的默认字符集解码当前参数中的字节数组来构造新的String
     */
        //无参构造
        String str1 = new String();

        //通过字符数组构造
        char chars[] = {'a', 'b', 'c'};
        String str2 = new String(chars);

        //通过字节数组构造
        byte bytes[] = {97, 89, 23};
        String str3 = new String(bytes);

    }

}
