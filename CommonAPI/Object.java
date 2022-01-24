package CommonAPI;

import java.util.Objects;

public class Object {
    /*
    java.lang.Object类是所有类的父类，即java语言的根类。
    object类中描述的所有方法子类都可以使用。
    在对象实例化时，最终找的父类就是Object。
    如果一个类没有特别指定父类，那么默认则继承自Object类。
     */


    // toString方法 public String toString()
    // toString方法返回该对象的字符串表示，其实该字符串内容就是对象的类型+@+内存地址值
    // 由于toString方法返回的结果是内存地址，而实际需要按照对象的属性得到相应的字符串表现形式，因此需要重写
    // 覆盖重写：
        // 如果不希望使用toString方法的默认行为，则可以对它进行重写
    private String name;
    private int age;

    public Object() {}

    public Object(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Define{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
    // 省略get、set方法

    public static void main(String[] args) {
        Object person = new Object("小琳", 22);
        String s = person.toString();
        System.out.println(s); // Define{name='小琳', age=22}
        // 在直接使用输出语句输出对象名的时候，其实是通过该对象调用了其toString()方法
        // 如果没有重写toString方法，那打印的即为对象的地址值



         /* // equals方法
    参数:
        Object obj:可以传递任意的对象
        == 比较运算符,返回的是一个布尔值 true false
        基本数据类型:比较的是值
        引用数据类型:比价的是两个对象的地址值
        this是谁?那个对象调用的方法,方法中的this就是那个对象;p1调用的equals方法所以this就是p1
        obj是谁?传递过来的参数p2
        this==obj -->p1==p2
     */
        Object p1 = new Object("小王", 22);
        Object p2 = new Object("小李", 21);
        boolean b1 = p1.equals(p1);
        boolean b2 = p2.equals(p2);
        System.out.println(b1);
        System.out.println(b2);



        // Objects类 java.util.Objects
        /*
        在jdk7添加了一个Objects工具类，提供了一些方法来操作对象，由一些静态的实用方法组成，
        这些方法是null-save(空指针安全的)或null-tolerant（容忍空指针的），
        用于计算对象的hashcode、返回对象的字符串表示形式、比较两个对象。
        再比较两个对象时，Object的equals方法容易抛出空指针异常，而Object类中的equals方法优化了这个问题
         */
        String s1 = null;
        String s2 = "lil";
        // Objects类的equals方法:对两个对象进行比较,防止空指针异常
//        public static boolean equals(Object a, Object b) {
//            return (a == b) || (a != null && a.equals(b));
//        }
        boolean a = s1.equals(s2); // NullPointerException null是不能调用方法的,会抛出空指针异常
        System.out.println(a);
        boolean b = Objects.equals(s1, s2);
        System.out.println(b);
    }


    // equals方法
    // 调用成员方法equals并指定参数为另一个对象，则可以判断这两个对象是否相同。这里的“相同”有默认和自定义两种方式。
        // 默认地址比较:
            // 如果没有覆盖重写equals方法，那么Object类中默认进行==运算符的对象地址比较，只要不是同一个对象，结果必然为false
        // 对象内容比较：
            // 如果希望进行对象的内容比较，即所有或知道的部分成员变量相同就判定两个对象相同，则可以覆盖重写equals方法。
//    问题:
//    隐含着一个多态
//    多态的弊端:无法使用子类特有的内容(属性和方法)
//    Object o = p2 = new Person("lil",21);
//    解决:可以使用向下转型(强转)把obj类型转换为Person
    @Override
    public boolean equals(java.lang.Object o) {
        // 如果对象地址一样，则认为相同,传递的参数o如果是this本身,直接返回true,提高程序的效率
        if (this == o)
            return true;
        // 如果参数为空或者类型信息不一样，则认为不同
        //getClass() != o.getClass() 使用反射技术,判断o是否是Person类型  等效于 obj instanceof Person
        if (o == null || getClass() != o.getClass())
            return false;
        // 转换为当前类型
        Object person = (Object) o;
        // 要求基本类型相等，并且将引用类型交给java.util.Object类的equals静态方法取用结果
        return age == person.age && Objects.equals(name, person.name);
        // 这段代码充分考虑了对象为空、类型一致等问题，但方法内容并不唯一，可以使用Generate选择自动生成

    }

}
