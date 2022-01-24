package ObjectOriented.BasicFeature.Extends.ComprehensiveTest;

import java.util.ArrayList;
import java.util.Random;

public class GroupMember extends Group{
    public GroupMember() {}

    public GroupMember(String name, double money) {

        super(name, money);
    }
    // 打开红包，就是从集合中，随机抽取一份，保存到自己的余额中
    public void openHongBao(ArrayList<Double> list) {
        Random random = new Random();
        int index = random.nextInt(list.size());
        // 移除一个金额,并存储在delta里
        double delta = list.remove(index);
        // 我自己有多少钱
        double money = super.getMoney();
        // 直接调用父类方法，设置到余额
        super.setMoney(money + delta);
    }
}
