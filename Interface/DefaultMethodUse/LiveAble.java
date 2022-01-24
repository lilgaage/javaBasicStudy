package Interface.DefaultMethodUse;

public interface LiveAble {
    // 默认方法
    // 可以继承，可以重写，二选一，但是只能通过实现类的对象来调用

    public default void fly() {
        System.out.println("天上飞");
    }
}
