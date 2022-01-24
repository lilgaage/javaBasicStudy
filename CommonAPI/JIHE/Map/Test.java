package CommonAPI.JIHE.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
    // 计算一个字符串中每个字符出现次数。
    /*
        1. 获取一个字符串对象
        2. 创建一个Map集合，键代表字符，值代表次数。
        3. 遍历字符串得到每个字符。
        4. 判断Map中是否有该键。
        5. 如果没有，第一次出现，存储次数为1；如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
        6. 打印最终结果
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = scanner.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 遍历字符串得到每个字符
            if (! map.containsKey(c)) { // 说明该字符没有出现过
                map.put(c, 1); // 那么将该字符出现的次数记为1
            } else {
                Integer count = map.get(c); // 先获取之前的次数
                map.put(c, ++count); // 更新次数，再次存入集合中
            }
        }
        System.out.println(map);
    }
}
