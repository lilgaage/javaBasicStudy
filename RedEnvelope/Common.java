package RedEnvelope;

import java.util.ArrayList;

public class Common implements OpenMode{

    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {

        // 创建保存各个红包金额的集合
        ArrayList<Integer> redList = new ArrayList<>();
        // 定义循环次数，总个数-1次
        int time = totalCount - 1;
        int money = totalMoney / totalCount;
        for (int i = 0; i < time; i++) {
            redList.add(money);
            totalMoney -= money;
        }
        // 最后一个红包
        redList.add(totalMoney);
        System.out.println("普通红包金额：" + redList);
        return redList;
    }
}
