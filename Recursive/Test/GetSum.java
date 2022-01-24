package Recursive.Test;

import java.util.Scanner;

public class GetSum {
    // 计算1 ~ n的和
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数n：");
        int n = scanner.nextInt();
        System.out.println("1-n累加的结果为：" + getSum(n));
    }

    private static int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }
}
