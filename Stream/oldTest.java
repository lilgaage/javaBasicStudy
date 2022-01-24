package Stream;

import java.util.ArrayList;
import java.util.List;

public class oldTest {
    /**
     * 现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下若干操作步骤：
     * 1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
     * 2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
     * 3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
     * 4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
     * 5. 将两个队伍合并为一个队伍；存储到一个新集合中。
     * 6. 根据姓名创建 Person 对象；存储到一个新集合中。
     * 7. 打印整个队伍的Person对象信息。
     */
    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("小琳小琳");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        //第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("小刘小刘");
        two.add("张无忌");
        two.add("赵子龙");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天琪");
        two.add("张二狗");
        // 1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
        List<String> oneList = new ArrayList<>();
        for (String name : one) {
            if (name.length() == 3) {
                oneList.add(name);
            }
        }
        // 2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        List<String> twoList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            twoList.add(oneList.get(i));
        }
        System.out.println(twoList);
        // 3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        List<String> threeList = new ArrayList<>();
        for (String name : two) {
            if (name.startsWith("张")) {
                threeList.add(name);
            }
        }
        // 4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
        List<String> fourList = new ArrayList<>();
        for (int i = 2; i < threeList.size(); i++) {
            fourList.add(threeList.get(i));
        }
        System.out.println(fourList);
        // 5. 将两个队伍合并为一个队伍；存储到一个新集合中。
        List<String> fiveList = new ArrayList<>();
        for (String name : twoList) {
            fiveList.add(name);
        }
        fiveList.addAll(fourList);
        System.out.println(fiveList);
        // 6. 根据姓名创建 Person 对象；存储到一个新集合中。
        List<Person> people = new ArrayList<>();
        for (String name : fiveList) {
            people.add(new Person(name));
        }
        // 7. 打印整个队伍的Person对象信息。
        for (Person person : people) {
            System.out.println(person);
        }
    }

}
