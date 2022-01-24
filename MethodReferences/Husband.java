package MethodReferences;

public class Husband {
    private static void marry(Richable richable) {
        richable.buy();
    }
    public void beHappy() {
        marry(() -> System.out.println("买套房子"));
        // beHappy()调用了结婚方法marry，后者的参数为函数式接口Richable，所以需要一个Lambda表达式
        // 如果这个Lambda表达式的内容已经在本类当中存在了，则可以用this替换
        marry(() -> this.beHappy());
        marry(this::beHappy); // 方法引用
    }
}
