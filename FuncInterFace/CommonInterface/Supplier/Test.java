package FuncInterFace.CommonInterface.Supplier;

import java.util.function.Supplier;

public class Test {
    // 使用Supplier接口作为方法参数类型，通过Lambda表达式求出int数组的最大值。
    private static int Max(Supplier<Integer> num) {
        return num.get();
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 67, 23, 432, 2};
        // 调用Max方法，参数传递Lambda
        int num = Max(() -> {
            int max = arr[0];
            for(int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(num);
    }
}
