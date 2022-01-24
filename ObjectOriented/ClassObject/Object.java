package ObjectOriented.ClassObject;

import ObjectOriented.ClassObject.Class;

public class Object {
    //创建对象格式
    //类名 对象名 = new 类名();
    //使用对象访问类中的成员
    //对象名.成员变量;
    //对象名.成员方法();
    public static void main(String[] args){
        Class s = new Class();
        System.out.println("s:" + s);
        //直接输出成员变量值
        System.out.println("姓名：" + s.name); //姓名：null
        System.out.println("年龄：" + s.age); //年龄：0

        //给成员变量赋值
        s.name = "lilgaage";
        s.age = 21;

        //再次输出成员变量的值
        System.out.println("姓名：" + s.name); //姓名：lilgaage
        System.out.println("年龄：" + s.age); //年龄：21

        //调用成员方法
        s.study(); //好好学习天天向上
        s.eat(); //下班干饭啦！

    }
    /*
    成员变量的默认值：
                        数据类型                     默认值
        基本类型    整数（byte，short，int，long）       0
                  浮点数（float，double）             0.0
                  字符（char）                      '\u0000'
                  布尔（boolean）                    false
        引用类型    数组，类，接口                      null
     */
}
