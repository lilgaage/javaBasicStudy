package MethodReferences;

public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("大家好，我是李张格");
    }
    // 定义方法method，传递Greetable接口
    public void method(Greetable g) {
        g.greet();
    }
    public void show() {
        method(() -> new Human().sayHello()); // 简化Lambda，创建Human对象，调用方法
        method(() -> super.sayHello()); // Lambda 使用super替代父类对象
        method(super::sayHello); // 方法引用调用父类方法
    }

}
