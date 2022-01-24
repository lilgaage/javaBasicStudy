package CommonAPI.JIHE.Generic;

public class MyGenericMethod {
    // 含有泛型的方法
    // 定义格式：
        // 修饰符 <代表泛型的变量> 返回值类型 方法名(参数) {}
    public <MVP> void show(MVP mvp) {
        System.out.println(mvp.getClass());
    }

    public <MVP> MVP show2(MVP mvp) {
        System.out.println(mvp);
        return mvp;
    }
    // 调用方法时，确定泛型的类型
    public static void main(String[] args) {
        MyGenericMethod myGenericMethod = new MyGenericMethod();
        myGenericMethod.show("lil"); // class java.lang.String
        myGenericMethod.show(213); // class java.lang.Integer
        myGenericMethod.show(5.2); // class java.lang.Double
        myGenericMethod.show2("李张格"); // 李张格
    }
}
