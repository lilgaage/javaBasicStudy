package FuncInterFace.CommonInterface.Function;

import java.util.function.Function;

public class Test {
    /**
     *  String str = "李张格,21";
     *  使用Function进行函数拼接
     *      1.字符串截取数组年龄部分，得到字符串
     *      2.将上一步的字符串转换为int类型的数字
     *      3.将上一步的int数字累加100，得到结果int数字
     */
    public static void main(String[] args) {
        String str = "李张格,21";
        int age = getAgeNum(
                str,
                s -> Integer.parseInt(str.split(",")[1]),
                s -> s += 100);
        System.out.println(age);
    }

    private static int getAgeNum(String str, Function<String, Integer> one, Function<Integer, Integer> two) {
        return one.andThen(two).apply(str);
    }
}
