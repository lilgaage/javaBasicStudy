package Interface.StaticMethodUse;

public interface LiveAble {
    // 静态与.class文件相关，只能使用接口名调用，不可通过实现类的类名或实现类的对象调用

    public static void run() {
        System.out.println("跑起来");
    }
}
