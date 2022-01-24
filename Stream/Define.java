package Stream;

import java.util.ArrayList;
import java.util.List;

public class Define {
    /**
     *  说到Stream便容易想到IOStream，而实际上，谁规定流就一定是IO流呢？
     *  在jdk8中，得益于Lambda所带来的的函数式编程，引入了一个全新的Stream概念，
     *  用于解决已有集合类库既有的弊端。
     *
     *  传统的集合多步遍历代码：
     *      几乎所有的结合，如Collection接口或Map接口等，都支持直接或间接的遍历操作。
     *      而当我们需要对集合中的元素进行操作时，除了必需的添加、删除、获取外，最典型的就是集合遍历。
     *      例如：
     *          List<String> list = new ArrayList<>();
     *          list.add("张无忌");
     *          list.add("周芷若");
     *          list.add("赵敏");
     *          list.add("张强");
     *          list.add("张三丰");
     *          for (String name : list) {
     *          System.out.println(name);
     *          }
     *      这是一段非常简单的集合遍历操作：对集合的每一个字符串都进行打印输出操作。
     *
     *  循环遍历的弊端：
     *      jdk8的Lambda让我们更加专注于做什么，而不是怎么做，
     *      可以发现，for循环的语法是“怎么做”，循环体才是“做什么”
     *      遍历是指每一个元素逐一进行处理，而并不是从第一个到最后一个顺次处理的循环。
     *      前者是目的，后者是方式。
     *      试想一下，如果希望对集合中的元素进行筛选过滤：
     *          1.将集合A根据条件过滤为子集B
     *          2.再根据条件二过滤为子集C
     */
    public static void main(String[] args) {
        // 在jdk8前的做法为：
        List<String> list = new ArrayList<>();
        list.add("小李");
        list.add("小刘");
        list.add("小琳");
        list.add("王琳凯");
        List<String> xiaoList = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("小")) {
                xiaoList.add(name);
            }
        }
        List<String> shortList = new ArrayList<>();
        for (String name : xiaoList) {
            if (name.length() == 2) {
                shortList.add(name);
            }
        }
        for (String name : shortList) {
            System.out.println(name);
        }
        // 循环是做事情的方式而不是目的。另一方面，使用线性循环就意味着只能遍历一次。如果再次遍历，只能使用另一个循环从头开始


        // Stream的更优写法：
        List<String> listStream = new ArrayList<>();
        list.add("小李");
        list.add("小刘");
        list.add("小琳");
        list.add("王琳凯");
        list.stream()
                .filter(s -> s.startsWith("xiao"))
                .filter(s -> s.length() == 2)
                .forEach(System.out::println);
    } // 直接阅读代码的字面意思即可完美展示无关逻辑方式的语义：
        // 获取流、过滤姓小、过滤长度为2、逐一打印
        // 代码中并没有体现使用线性循环或是其他任何算法进行遍历，真正要做的事情内容被更好体现在代码中。
}
