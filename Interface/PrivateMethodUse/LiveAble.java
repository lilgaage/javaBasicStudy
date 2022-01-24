package Interface.PrivateMethodUse;

public interface LiveAble {
    /*
    私有方法：只有默认方法可以调用
    私有静态方法：默认方法和静态方法可以调用

    如果一个接口汇总有多个默认方法，并且方法中有重复的内容，那么可以抽取出来，
    封装到私有方法中，供默认方法去调用。
    从设计的角度讲，私有的方法是对默认方法和静态方法的辅助。
     */

//    default void func() {
//        func1();
//        func2();
//    }
//    private void func1() {
//        System.out.println("跑起来");
//    }
//    private void func2() {
//        System.out.println("跑起来");
//    }
}
