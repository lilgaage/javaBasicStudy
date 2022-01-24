package CommonAPI.JIHE.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// HashMap存储自定义类型键值
//  练习：每位学生（姓名，年龄）都有自己的家庭住址。既然有对应关系，
//  则将学生对象和家庭住址存储到map集合中。学生作为键, 家庭住址作为值。
//  注意，学生姓名相同并且年龄相同视为同一名学生。
public class TestHashMap {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();
        map.put(new Student("小琳", 22), "福建厦门");
        map.put(new Student("小李", 21), "湖北襄阳");
        map.put(new Student("遛狗", 21), "广东广州");
        // 取元素 键找值
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key + "家庭住址是" + value);
        }
    }
    /*
        当给HashMap中存放自定义对象时，如果自定义对象作为key存在，这时要保证对象唯一，必须复写对象的HashCode和equals方法。
        如果要保证map中存放的key和取出的顺序一致，可以使用java.util.LinkedHashMap集合来存放
     */
}
