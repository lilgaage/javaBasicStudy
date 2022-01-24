package Recursive;

public class Define {
    /**
     *  递归：在当前方法内调用自己
     *  分类：
     *      直接递归：方法自身调用自己
     *      间接递归：A调用B，B调用C，C调用A
     *  注意：
     *      递归一定要有条件限定，保证递归能够停止，否则会发送栈内存溢出
     *      在递归中虽有限定条件，但递归次数不能太多，否则也会发送栈内存溢出
     *      构造方法禁止递归
     */
    public static void main(String[] args) {
        a(5);


    }
    public Define() {
//        Define(); // 构造方法禁止递归，构造方法是用来创建对象的，不能一直让对象创建下去
    }

    private static void a(int i) {
        if (i == 0) {
            return; // 结束方法
        }
        System.out.println("a方法" + i);
        a(--i);
    }
}
