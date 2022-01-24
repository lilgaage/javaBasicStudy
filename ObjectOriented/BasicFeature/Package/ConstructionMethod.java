package ObjectOriented.BasicFeature.Package;

public class ConstructionMethod {
    /*
    当一个对象被创建的时候，构造方法用来初始化该对象，给对象的成员变量赋初始值
    无论是否定义构造方法，所有的类都有构造方法，因为java自动提供了一个无参数构造方法，一旦自己定义了，那无参构造方法就失效

    格式：
     修饰符 构造方法名（参数列表）{
        //方法体
        }

     */

    //构造方法的写法上，方法名与它所在的类名相同。它没有返回值，所以不需要返回值类型，甚至不需要void
    private String name;
    private int age;

    //无参构造方法
    public ConstructionMethod(){

    }

    //有参构造方法
    public ConstructionMethod(String name, int age){
        this.name = name;
        this.age = age;
    }
    /*
    1.如果不提供构造方法，系统会给出无参构造方法
    2.如果提供了构造方法，系统将不再提供无参构造方法
    3.构造方法是可以重载的，即可以定义参数，也可以不定义参数
     */

}
