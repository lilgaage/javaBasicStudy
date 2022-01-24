package CommonAPI.JIHE.Generic;

// 自定义泛型类
public class MyGenericClass<MVP> {
    // 没有MVP类型，在这里代表未知的一种数据类型，未来传递什么就是什么类型
    private MVP mvp;

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }

    public MVP getMvp() {
        return mvp;
    }

    public static void main(String[] args) {
        // 创建一个泛型为String的类
        MyGenericClass<String> myString = new MyGenericClass<>();
        // 调用setMvp
        myString.setMvp("小琳");
        // 调用getMvp
        String mvp = myString.getMvp();
        System.out.println(mvp);

        // 创建一个泛型为Integer的类
        MyGenericClass<Integer> myInteger = new MyGenericClass<>();
        myInteger.setMvp(213);
        Integer mvp2 = myInteger.getMvp();
        System.out.println(mvp2);
    }
}
