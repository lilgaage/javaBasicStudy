package Interface.AbstractMethodUse;

public class Animal implements LiveAble{

    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("晚上睡觉");
    }
}
