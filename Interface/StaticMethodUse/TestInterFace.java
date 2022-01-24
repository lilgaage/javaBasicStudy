package Interface.StaticMethodUse;

public class TestInterFace {

    public static void main(String[] args) {
        // 静态与.class文件相关，只能使用接口名调用，不可通过实现类的类名或实现类的对象调用
        LiveAble.run();
//        Animal.run(); // 【错误】无法继承方法，也无法调用
    }
}
