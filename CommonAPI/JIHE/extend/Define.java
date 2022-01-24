package CommonAPI.JIHE.extend;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Define {
    /*
    通常，在代码中创建一个集合，例如list和set，并直接用一些元素填充它。
    实例化集合，add方法重复调用。
    在java9中，添加了几种集合工厂方法，更方便创建少量元素的集合、map实例。
    新的List、Set、Map的静态工厂方法可以更方便地创建集合的不可变实例。
     */
    public static void main(String[] args) {
//        Set<String> str1 = Set.of("a", "b", "c");
//        System.out.println(str1);
//        Map<String, Integer> str2 = Map.of("a", 1, "b", 2);
//        System.out.println(str2);
//        List<String> str3 = List.of("a", "b");
//        System.out.println(str3);
    }
    // 需要注意：
        // 1.of()方法只是Map、List、Map这三个接口的静态方法，其父类和子类实现并没有这类方法，比如HashSet、ArrayList等
        // 2.返回的集合是不可变的
}
