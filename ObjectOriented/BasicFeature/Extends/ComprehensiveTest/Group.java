package ObjectOriented.BasicFeature.Extends.ComprehensiveTest;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Group {

    private String name;
    private double money;

    public Group() {}

    public Group(String name, double money){
        this.name = name;
        this.money = money;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setMoney(double money) {

        this.money = money;
    }

    public double getMoney() {

        return money;
    }

    // 展示信息的方法
    public void show() {
        // 保留两位小数，但不四舍五入
        int tmp = (int) (money * 100);
        money = tmp / 100.0;
        System.out.printf("用户名:%s, 余额为:%.2f元\n", name, money);
    }
}
