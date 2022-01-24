package CommonAPI.Math;

public class Test {
    // 计算在 -10.8 到 5.9 之间，绝对值大于 6 或者小于 2.1 的整数有多少个？
    public static void main(String[] args) {
        double max = 5.9;
        double min = -10.8;
        int count = 0;
        for (double i = min; i <= max; i++){
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1){
                count++;
            }
        }
        System.out.print("个数为：" + count);
    }
}
