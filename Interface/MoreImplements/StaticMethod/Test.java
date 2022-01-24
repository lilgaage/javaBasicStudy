package Interface.MoreImplements.StaticMethod;

public class Test {

    // 接口中，存在同名的静态方法并不会冲突，原因是只能通过各自接口名访问静态方法。
    public static void main(String[] args) {

        // 既继承父类，又实现若干个接口时，父类的成员发放与接口中的默认方法重名，子类就近选择父类的成员方法。
        C c = new C();
        c.methodA(); // BBBBBBBBBB
    }
}
