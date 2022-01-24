package CommonAPI.Static;

public class ClassVariable {
    /*
    static可以用来修饰成员变量和成员方法，被修饰的成员是属于类的，而不单单是属于某个对象的。也就是说，可以不靠创建对象来调用
     */

    // 类变量，该类的每一个对象都共享同一个类变量的值，任何对象都可以更改该类变量的值，也可在不创建给类的对象情况下更改类变量的值
    // 格式： static 数据类型 变量名;

    /*
        学员报到。现在想为每一位新来报到的同学编学号（sid），从第一名同学开始，sid为1，以此类推。
        学号必须是唯一的，连续的，并且与班级的人数相符，这样以便知道，要分配给下一名新同学的学号是多少。
        这样我们就需要一个变量，与单独的每一个学生对象无关，而是与整个班级同学数量有关。
        所以可以定义一个静态变量numberOfStudent,也叫类变量
     */
    private String name;
    private int age;
    private int sid;
    // 类变量，记录学生数量，分配学号
    public static int numberOfStudent;
    public ClassVariable(String name, int age){
        this.name = name;
        this.age = age;
        // 通过numberOfStudent给学生分配学号
        this.sid = ++numberOfStudent;
    }
    public  void show(){

        System.out.println("学生姓名：" + name + "年龄：" + age+ "学号：" + sid);
    }

    public static void main(String[] args) {
        ClassVariable s1 = new ClassVariable("小刘", 21);
        ClassVariable s2 = new ClassVariable("小王", 22);
        ClassVariable s3 = new ClassVariable("小琳", 22);
        ClassVariable s4 = new ClassVariable("小凯", 22);

        s1.show();
        s2.show();
        s3.show();
        s4.show();

    }
}
