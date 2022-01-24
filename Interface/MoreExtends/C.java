package Interface.MoreExtends;

public interface C extends A, B{

    /*
    一个接口能继承另一个或多个接口，这和类之间的继承比较类似。
    接口继承使用extends关键字，子接口继承父接口的方法。
    如果父接口中的默认方法有重名的，那么子接口需要重写一次。
     */

    @Override
    public default void method() {
        System.out.println("CCCCCCCCCCCCCCCCCCCCC");
    }

    // 子接口重写默认方法时，default关键字可以保留。
    // 子类重写默认方法时，default关键字不可以保留。


    /*
    其他成员特点：
        接口中，无法定义成员变量，但是可以定义常量，其值不可以改变，默认使用public static final修饰
        接口中，没有构造方法，不能创建对象
        接口中，没有静态代码块。
     */
}
