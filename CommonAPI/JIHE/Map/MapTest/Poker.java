package CommonAPI.JIHE.Map.MapTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Poker {
    public static void main(String[] args) {
        HashMap<Integer, String> pokerBox = new HashMap<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        // 设置存储编号变量
        int count = 1;
        pokerBox.put(count++, "大王");
        pokerBox.put(count++, "小王");
        // 创建牌 存储到map中
        for (String number : numbers) {
            for (String color : colors) {
                String card = color + number;
                pokerBox.put(count++ , card);
            }
        }
        System.out.println(pokerBox); // 54张牌
        // 打乱54张牌
        // 遍历所有的键，获取编号集
        Set<Integer> numberSet = pokerBox.keySet();
        // 因为要将编号打乱顺序 所以应该先转换到list集合中
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        // 打乱顺序
        Collections.shuffle(numberList);
        // 发牌的序号 存入序号
        ArrayList<Integer> personNo1 = new ArrayList<>();
        ArrayList<Integer> personNo2 = new ArrayList<>();
        ArrayList<Integer> personNo3 = new ArrayList<>();
        ArrayList<Integer> dipaiNo = new ArrayList<>();
        for (int i = 0; i < numberList.size(); i++) {
            // 获取该编号
            Integer no = numberList.get(i);
            // 发牌 留出底牌
            if (i >= 51) {
                dipaiNo.add(no);
            } else {
                if (i % 3 == 0) {
                    personNo1.add(no);
                } else if (i % 3 == 1) {
                    personNo2.add(no);
                } else {
                    personNo3.add(no);
                }
            }

        }
        // 查看三人各自手中的牌（按牌的大小排序）、底牌
        // 对手中的序号排序
        Collections.sort(personNo1);
        Collections.sort(personNo2);
        Collections.sort(personNo3);
        Collections.sort(dipaiNo);
        // 创建三个玩家牌面集合 以及底牌牌面集合
        ArrayList<String> person1 = new ArrayList<>();
        ArrayList<String> person2 = new ArrayList<>();
        ArrayList<String> person3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (Integer i : personNo1) {
            // 根据编号找到对应的牌面 键找值
            String card = pokerBox.get(i);
            // 添加到对应的牌面集合中
            person1.add(card);
        }
        for (Integer i : personNo2) {
            // 根据编号找到牌面pokerBox
            String card = pokerBox.get(i);
            // 添加到对应的牌面集合中
            person2.add(card);
        }
        for (Integer i : personNo3) {
            // 根据编号找到牌面pokerBox
            String card = pokerBox.get(i);
            // 添加到对应的牌面集合中
            person3.add(card);
        }
        for (Integer i : dipaiNo) {
            // 根据编号找到牌面pokerBox
            String card = pokerBox.get(i);
            // 添加到对应的牌面集合中
            dipai.add(card);
        }
        // 看牌
        System.out.println("玩家1：" + person1);
        System.out.println("玩家2：" + person2);
        System.out.println("玩家3：" + person3);
        System.out.println("底牌：" + dipai);
    }
}
