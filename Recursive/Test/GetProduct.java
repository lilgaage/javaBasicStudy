package Recursive.Test;

import java.util.Scanner;

public class GetProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数n：");
        int product = getProduct(scanner.nextInt());
        System.out.println("该数的阶乘为：" + product);
    }

    private static int getProduct(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getProduct(n - 1);
        }
    }
}
