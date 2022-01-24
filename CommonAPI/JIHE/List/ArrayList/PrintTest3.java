package CommonAPI.JIHE.List.ArrayList;

import java.util.ArrayList;

public class PrintTest3 {
    //定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。格式参照 {元素@元素@元素}
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("李张格");
        list.add("王小琳");
        list.add("lilgaage");
        // 调用方法
        printArrayList(list);

    }

    public static void printArrayList(ArrayList<String> list){
        // 拼接左括号
        System.out.print("{");
        // 遍历集合
        for (int i = 0; i < list.size(); i++){
            // 获取元素
            String s = list.get(i);
            // 拼接@符号
            if (i != list.size() - 1){
                System.out.print(s + "@");
            }else {
                //拼接右括号
                System.out.print(s + "}");
            }

        }
    }
}
