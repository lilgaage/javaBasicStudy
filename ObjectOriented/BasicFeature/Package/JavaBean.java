package ObjectOriented.BasicFeature.Package;

public class JavaBean {
    /*
    javabean是java编写类的一种标准规范。符合javabean的类，要求类必须是具体和公共的，并且具有无参的构造方法。
    提供用来操作成员变量的set和get方法
     */

    //格式：
        public class ClassName{
            //成员变量
            //构造方法
            //无参构造方法【必须】
            //有参构造方法【建议】
            //成员方法
            //getXxx()
            //setXxx()
    }

    //编写符合javabean规范的类
    //成员变量
    private String name;
    private int age;

    //无参构造方法
    public JavaBean() {}

    //有参构造方法
    public JavaBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //成员方法
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        //无参构造使用
        JavaBean student = new JavaBean();
        student.setName("lilgaage");
        student.setAge(21);
        System.out.println(student.getName()+"\n"+student.getAge());

        //有参构造使用
        JavaBean student1 = new JavaBean("小刘", 21);
        System.out.println(student1.getName()+"今年"+student1.getAge());

    }


}
