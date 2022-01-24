package CommonAPI.JIHE.Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Define {
    public static void main(String[] args) {
        demo_mis();
    }

    /*
    集合是可以存放任意对象的，只要把对象存储集合后，那么他们都会被提升成Object类型。
    取出每一个对象并进行响应的操作时，必须采用类型转换。
     */
    public static void demo_mis() {
        Collection collection = new ArrayList<>();
        collection.add(5);
        collection.add("lil");
        collection.add("123"); // 由于集合没有做限定，所以任何类型都可以存放
        // 获取迭代器
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            // 取出的元素是obj类型
            Object obj = iterator.next();
            System.out.println(obj);
            // 想要使用String类特有的方法，不能使用  多态 Object obj = "abc";需要向下转型
            String str = (String) obj;
            System.out.println(str.length());
            // 抛出ClassCastException类型转换异常,不能把Integer类型转换为String类型
            /*
            由于集合汇总什么类型的元素都可以存储。导致取出时强制转换引发运行时ClassCastException。
            Collection虽然可以存储各种对象，但实际上通常Collection只存储同一类型对象。
            因此在jdk5后，新增了泛型（Generic）语法，在设计API时可以指定类或方法支持泛型，
            这样使用API也变得更为简洁，并得到了编译时期的语法检查。
             */
        }
    }
     /*
            泛型：可以在类或方法汇总预支地使用未知的类型。
            一般在创建对象时，将未知的类型确定具体的类型。当没有指定泛型时，默认类型为Object类型。
            使用泛型的好处：
                1.将运行时期的ClassCastException转移到了编译时期变成了编译失败
                2.避免了类型强制转换的麻烦
                当集合明确类型后，存放类型不一致就会编译报错，
                集合已经明确存放的元素类型，那么在使用迭代器的时候，迭代器也同样会知道具体遍历元素类型，
                当使用Iterator控制元素类型后，就不需要强制转换了。获取到的元素直接就是该类型。
                tips：泛型是数据类型的一部分，将类名与泛型合并一起看做数据类型。
            弊端:
                泛型是什么类型,只能存储什么类型的数据
             */

    // 泛型：用来灵活地将数据类型应用到不同的类、方法、接口中。将数据类型作为参数进行传递。
    /*
    定义格式：
        修饰符 class 类名<代表泛型的变量> {}
     例如ArrayList：
        class ArrayList<E> {
            public boolean add(E e) {}
            public E get(int index) {}
        }
    使用泛型即什么时候确定泛型。
    在创建对象的时候确定泛型。
    例如 ： ArrayList<String> list = new ArrayList<String>();
        此时，遍历E的值就是String类型，那么我们的类型就可以理解为：
            class ArrayList<String> {
                public boolean add(String s) {}
                public String get(int index) {}
            }
     */


}
