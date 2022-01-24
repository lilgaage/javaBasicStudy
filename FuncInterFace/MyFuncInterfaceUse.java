package FuncInterFace;

public class MyFuncInterfaceUse {
    // 使用自定义的函数式接口作为方法参数
    private static void doSomething(MyFuncInterface inter) {
        inter.myMethod(); // 调用自定义的函数式接口方法
    }
    public static void main(String[] args) {
        // 调用使用函数式接口的方法
        doSomething(() -> System.out.println("Lambda执行啦"));
    }
}
