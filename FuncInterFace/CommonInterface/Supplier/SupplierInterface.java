package FuncInterFace.CommonInterface.Supplier;

import java.util.function.Supplier;

public class SupplierInterface {
    /**
     *  java.util.function.Supplier<T>接口仅包含一个无参的方法：T get()。
     *  用来获取一个泛型指定类型的对象数据。由于这是一个函数式接口，
     *  也就意味着对应的Lambda表达式需要“对外提供”一个符合泛型类型的对象数据。
     */
    private static String getString(Supplier<String> func) {
        return func.get();
    }

    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "LilGaage";
        System.out.println(getString(() -> msgA + msgB));
    }
}
