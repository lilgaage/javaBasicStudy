package Lambda.ParaReturn;

import java.util.Arrays;
import java.util.Comparator;

public class Older {
    /**
     *  传统写法
     */
    public static void main(String[] args) {
        Person[] array = {
                new Person("小琳", 22),
                new Person("小李", 21),
                new Person("小王", 22)};
        // 匿名内部类
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(array, comparator);
        for (Person person : array) {
            System.out.println(person);
        }
    }
    /**
     *  这种做法在慢性对象的思想中，似乎是“理所当然”的。
     *  其中Comparator接口的实例（使用了匿名内部类）代表了"按照年龄从小到大"的排序规则。
     *
     *  代码分析：
     *      为了排序，Arrays.sort方法需要排序规则，即Comparator接口的实例，抽象方法compare是关键
     *      为了指定compare的方法体，不得不需要Comparator接口的实现类
     *      为了省去定义一个ComparatorImpl实现类的麻烦，不得不使用匿名内部类
     *      必须重写抽象方法compare，所以方法名、参数、返回值不得不再写一遍，且不能写错
     *      实际上，只有参数和方法体是关键
     */

}
