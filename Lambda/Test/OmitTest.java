package Lambda.Test;

import Lambda.Test.NoParaNoReturn.Cook;

public class OmitTest {
    public static void main(String[] args) {
        invokCook(() -> System.out.println("吃饭了"));
    }

    private static void invokCook(Cook cook) {
        cook.makeFood();
    }
    /**
     *  Lambda使用前提：
     *      1.使用Lambda必须具有接口，且要求接口中有且仅有一个抽象方法
     *          无论是jdk内置的Runnable、Comparator接口还是自定义的接口，
     *          只有当接口中的抽象方法存在且唯一时，才可使用Lambda
     *      2.使用Lambda必须具有上下文推断。
     *          也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实例
     * 有且仅有一个抽象方法的接口，称为“函数式接口”
     *
     */
}
