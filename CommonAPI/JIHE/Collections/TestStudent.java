package CommonAPI.JIHE.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("小琳", 21);
        list.add(stu1);
        list.add(new Student("小李,", 22));
        Collections.addAll(list, new Student("小王", 20), new Student("小八", 8));
        // 让学生按照年龄排序
        Collections.sort(list); // 该list中元素类型必须实现比较器comparable接口
        /*
        public class Student implements Comparable<Student>{
            ....
            @Override
            public int compareTo(Student o) {
            return this.age‐o.age; // 升序
            }
        }
         */
        for (Student student : list) {
            System.out.println(student);
        }


        // 如果在使用的时候，想要独立的定义规则去使用，可以采用
        // Collections.sort(List list, Comparetor c)方式，自己定义规则
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge(); // 以学生年龄降序
            }
        });
        for (Student student : list) {
            System.out.println(student);
        }


        // 如果想要规则多一点，可以参考
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getAge() - o1.getAge(); // 年龄降序
                if (result == 0) { // 第一个规则判断完，下一个规则 姓名首字符升序
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
