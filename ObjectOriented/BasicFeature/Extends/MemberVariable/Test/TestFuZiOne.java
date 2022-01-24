package ObjectOriented.BasicFeature.Extends.MemberVariable.Test;

import ObjectOriented.BasicFeature.Extends.MemberVariable.Test.ZiOne;

public class TestFuZiOne {
    public static void main(String[] args) {
        // 成员变量不重名
        // 如果子类父类中出现不重名的成员变量，这时的访问是没有影响的

        // 创建子类对象
        ZiOne ziOne = new ZiOne();
        ziOne.show(); // 调用子类方法
        /*
        Fu name: 5
        Zi name: 6
         */
    }
}
