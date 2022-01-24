package FuncInterFace.CommonInterface.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    // 集合信息筛选
    // 数组当中有多条“姓名+性别”的信息，请通过Predicate接口的拼装将符合要求的字符串筛选到结合ArrayList中，
    // 需要同时满足两个条件：
    //  1.必须为女生
    //  2.姓名为四个字
    public static void main(String[] args) {
        String[] array = {"小李小李,女", "小琳小琳,男", "小刘,女"};
        List<String> list = biJiao(
                s -> "女".equals(s.split(",")[1]),
                s -> s.split(",")[0].length() == 4,
                array);
        System.out.println(list);
    }
    private static List<String> biJiao(Predicate<String> one, Predicate<String> two, String[] array) {
        List<String> list = new ArrayList<>();
        for (String info : array) {
            if (one.and(two).test(info)) {
                list.add(info);
            }
        }
        return list;
    }
}
