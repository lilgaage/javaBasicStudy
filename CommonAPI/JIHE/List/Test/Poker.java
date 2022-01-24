package CommonAPI.JIHE.List.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        // 牌盒 多态创建集合，那么使用shuffle(List<?> list) 需要强制转换
        ArrayList<String> pckerBox = new ArrayList<>();
        // 花色
        Collection<String> colors = new ArrayList<>();
        colors.add("❤");
        colors.add("♦");
        colors.add("♠");
        colors.add("♣");
        // 数字
        Collection<String> numbers = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("A");
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");
        // 创造牌 拼接牌
        // 拿出每一个花色 然后跟每一个数字进行结合，存储到牌盒中
        for (String color : colors) {
            for (String number : numbers) {
                String card = color + number;
                pckerBox.add(card);
            }
        }
        pckerBox.add("大王");
        pckerBox.add("小王");
        System.out.println(pckerBox); // 一副牌
         // 洗牌 将牌盒中牌的索引打乱 Collection工具类都是静态方法
         // static void shuffle(List<?> list) 使用默认随机源对知道列表进行置换
        Collections.shuffle(pckerBox);

        // 发牌
        ArrayList<String> person1 = new ArrayList<>();
        ArrayList<String> person2 = new ArrayList<>();
        ArrayList<String> person3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        // 遍历牌盒 必须知道索引
        for (int i = 0; i < pckerBox.size(); i++) {
            // 获取牌面
            String card = pckerBox.get(i);
            // 留出三张底牌存到底牌集合中
            if (i >= 51) { // 存到底牌集合中
                dipai.add(card);
            } else {
                if (i % 3 == 0) {
                    person1.add(card);
                } else if (i % 3 == 1) {
                    person2.add(card);
                } else {
                    person3.add(card);
                }
            }
        }
        // 看牌
        System.out.println("玩家1：" + person1);
        System.out.println("玩家2：" + person2);
        System.out.println("玩家3：" + person3);
        System.out.println("底牌：" + dipai);
    }
}
