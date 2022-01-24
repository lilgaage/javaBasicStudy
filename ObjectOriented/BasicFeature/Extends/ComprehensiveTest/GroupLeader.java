package ObjectOriented.BasicFeature.Extends.ComprehensiveTest;

import java.util.ArrayList;

public class GroupLeader extends Group{

    public GroupLeader() {}

    public GroupLeader(String name, double money){
        // 调用父类构造方法
        super(name, money);
    }
    /*
    群主发红包，就是把一个整数的金额，分层若干等份。
    1.获取群主余额,是否够发红包.
        不能则返回null,并提示.
        能则继续.
    2.修改群主余额.
    3.拆分红包.
        3.1.如果能整除，那么就平均分。
        3.2.如果不能整除，那么就把余数分给最后一份。
*/
    public ArrayList<Double> send(double totalMoney, int count) {

        // 创建一个集合，存储红包
        ArrayList<Double> list = new ArrayList<>();

        // 获取群主余额
        double startMoney = super.getMoney();
        if (totalMoney > startMoney) {
            System.out.println("余额不足");
            return list; // 返回空集合
        }
        // 修改群主余额,扣钱
        super.setMoney(startMoney - totalMoney);
        // 扩大100倍，相当于折算成“分”为单位，避免小数运算损失精度的问题
        totalMoney = totalMoney * 100;
        // 每份的金额
        double avg = totalMoney / count;
        // 不能整除的余数
        double mod = totalMoney % count;
        // 无论是否整除，n-1份都是每份的等额金额
        for (int i = 0; i < count - 1; i++) {
            // 缩小100倍，折算成“元”
            list.add(avg / 100.0);
        }
        // 最后一份红包
        list.add((avg + mod) / 100.0);

        // 返回集合
        return list;

    }


}
