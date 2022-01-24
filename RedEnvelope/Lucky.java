package RedEnvelope;

import java.util.ArrayList;
import java.util.Random;

public class Lucky implements OpenMode{
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> redList = new ArrayList<>();
        int time = totalCount - 1;
        Random random = new Random();
        for (int i = 0; i < time; i++) {
            int money = random.nextInt(totalMoney / totalCount * 2) + 1;
            redList.add(money);
            totalMoney -= money;
            // 红包个数减1
            totalCount--;
        }
        redList.add(totalMoney);
        return redList;
    }
}
