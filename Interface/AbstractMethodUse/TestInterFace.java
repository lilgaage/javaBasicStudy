package Interface.AbstractMethodUse;

public class TestInterFace {
    public static void main(String[] args) {
        // 创建子类对象
        Animal animal = new Animal();
        // 调用实现后的方法
        animal.eat();
        animal.sleep();
    }
}
