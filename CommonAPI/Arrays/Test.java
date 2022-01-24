package CommonAPI.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    // 将一个随机字符串中的所有字符升序排列，并倒序打印。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = scanner.nextLine();
        // 转换为字符数组
        char[] chars = s.toCharArray();
        // 升序排序
        Arrays.sort(chars);
        System.out.println(chars); // 字符数组 0333489ddefh
        System.out.println(s); // 字符串 3deh39d0843f
        // 倒序输出
        for (int i = chars.length - 1; i >= 0; i--){
            System.out.print(chars[i]);
        }
    }
}
