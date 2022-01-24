package MethodReferences;

public class superMemberMethod {
    // 通过super引用成员方法
    // 如果存在继承关系，当Lambda中需要出现super调用时，也可使用方法引用进行替代。
    // 函数式接口为Greetable
    // 父类为Human
    // 子类为Man
//    () -> super.sayHello()等效于super::sayHello
}
