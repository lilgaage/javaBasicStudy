package MethodReferences;

public class ArrayConstructor {
    // 数组也是Object的子类对象，所以同样具有构造器，只是语法稍有不同。
    // 对应到Lambda的使用场景中，一个函数式接口ArrayBuilder
    private static int[] initArray(int length, ArrayBuilder builder) {
        return builder.buildArray(length);
    }

    public static void main(String[] args) {
        int[] array = initArray(10, length -> new int[length]);
        int[] arrayBuildr = initArray(10, int[]::new);
    }
}
