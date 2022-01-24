package ObjectOriented.ClassObject;

public class Class {
    //成员变量：对应事物的属性
    //成员方法：对应事物的行为

    //类的定义格式
    public class ClassName {
        //成员变量
        //成员方法
    }
    /*
   定义类：就是定义类的成员，包括成员变量和成员方法
   成员变量：和定义变量几乎一致。不过位置在类中，方法外
   成员方法：和定义方法几乎一致。不过去掉static
    */
        //成员变量
        String name;
        int age;

        //成员方法
        public void study(){
            System.out.println("好好学习天天向上");
        }

        public void eat(){
            System.out.println("下班干饭啦！");
        }
    }

