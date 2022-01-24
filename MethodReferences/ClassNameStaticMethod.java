package MethodReferences;

public class ClassNameStaticMethod {
    // 通过类名引用静态方法
    // 由于在java.lang.Math类中已经存在了静态方法abs，所以当需要通过Lambda来调用该方法时，有两种写法
    // 函数式接口为Calcable
    private static void method(int num, Calcable calcable) {
        System.out.println(calcable.calc(num));
    }

    public static void main(String[] args) {
        method(-10, num -> Math.abs(num));
        method(-10, Math::abs);
        // num -> Math.abs(num)等效于Math::abs
    }
}
