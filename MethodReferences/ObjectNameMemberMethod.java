package MethodReferences;

public class ObjectNameMemberMethod {
    // 通过对象名引用成员方法
    // 这是最常见的一种用法，如果一个类中已经存在了一个成员方法
    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
    // 函数式接口仍然为Printable
    // 那么当需要使用这个printUpperCase成员方法来替代Printable接口的Lambda的时候，
    // 已经具有了该类的对象实例，则可以通过对象名引用成员方法
    private static void printString(Printable lambda) {
        lambda.print("LilGaage");
    }

    public static void main(String[] args) {
        ObjectNameMemberMethod obj = new ObjectNameMemberMethod();
        printString(obj::printUpperCase);
    }

}
