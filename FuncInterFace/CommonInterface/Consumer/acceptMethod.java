package FuncInterFace.CommonInterface.Consumer;

import java.util.function.Consumer;

public class acceptMethod {
    /**
     *  Consumer接口中包含抽象方法void accept(T t),意为消费一个指定泛型的数据。
     */
    private static void consumeString(Consumer<String> func) {
        func.accept("Hello");
    }

    public static void main(String[] args) {
        consumeString(s -> System.out.println(s));
    }
}
