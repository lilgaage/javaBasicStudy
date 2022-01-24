package ObjectOriented.BasicFeature.Package;

public class Private {
    //private的含义：
    //            1.private是一个权限修饰符，代表最小权限
    //            2.可以修饰成员变量和成员方法
    //            3.被priva修饰后的成员变量和成员方法，只在本类中才能访问

    //使用private修饰成员变量
    private String name;
    private int age;

    //提供get set方法，可以访问成员变量
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

}
