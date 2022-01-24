package Interface.MoreImplements.DefaultMethod;

public class C implements A, B{
    // 接口中，有多个默认方式时，实现类都可继承使用。
    // 如果默认方法有重名的，必须重写一次。

    @Override
    public void method() {
        System.out.println("method");
    }

}
