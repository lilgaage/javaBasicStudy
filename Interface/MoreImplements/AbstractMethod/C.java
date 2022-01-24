package Interface.MoreImplements.AbstractMethod;

public class C implements A, B {

    // 接口中，有多个抽象方法时，实现类必须重写所有抽象方法。
    // 如果抽象方法有重名的，只需要重写一次。
    
    @Override
    public void showA() {
        System.out.println("showA");
    }

    @Override
    public void showB() {
        System.out.println("showB");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
