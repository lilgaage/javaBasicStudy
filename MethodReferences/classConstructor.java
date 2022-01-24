package MethodReferences;

public class classConstructor {
    // 类的构造器引用
    // 由于构造器名称与类名完全一样，并不固定，所以构造器引用使用“类名称::new”的格式表示
    // 一个简单的类Person
    // 用来创建Person对象的函数式接口PersonBuilder
    public static void printName(String name, PersonBuilder builder) {
        System.out.println(builder.buildPerson(name).getName());
    }

    public static void main(String[] args) {
        printName("李张格", name -> new Person(name));
        printName("李张格", Person::new); // 构造器引用
    }
}
