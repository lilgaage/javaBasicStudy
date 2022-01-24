package ObjectOriented.BasicFeature.Extends.ComprehensiveTest;

import java.util.ArrayList;
import java.util.Scanner;

public class TestGroup {
    public static void main(String[] args) {
        // 创建一个群主对象
        GroupLeader groupLeader = new GroupLeader("群主", 200.0);
        GroupMember groupMember1 = new GroupMember("小刘", 0.0);
        GroupMember groupMember2 = new GroupMember("小琳", 0.0);
        GroupMember groupMember3 = new GroupMember("小王", 0.0);

        groupLeader.show();
        groupMember1.show();
        groupMember2.show();
        groupMember3.show();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入金额：");
        double money = scanner.nextDouble();
        System.out.println("请输入个数：");
        int count = scanner.nextInt();

        // 发送红包
        ArrayList<Double> list = groupLeader.send(money, count);

        System.out.println("抢红包啦！！！！！");

        groupMember1.openHongBao(list);
        groupMember2.openHongBao(list);
        groupMember3.openHongBao(list);

        groupLeader.show();
        groupMember1.show();
        groupMember2.show();
        groupMember3.show();
    }
}
