package CommonAPI.System;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        curTimeMillis();
        arrCopy();
    }

    // 验证for循环打印数字1-9999所需要使用的时间（毫秒）
    private static void curTimeMillis() {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("共耗时" + time + "毫秒");
    }

    // 将src数组中前3个元素，复制到dest数组的前3个位置上
    // 复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
    // 复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
    private static void arrCopy() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};
        System.out.println("复制前：" + Arrays.toString(dest));
        // 源数组, 源数组中起始索引, 目标数组, 目标数据中的起始位置, 要复制的数组元素的数量
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后：" + Arrays.toString(dest));
    }
}
