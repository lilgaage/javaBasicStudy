package CommonAPI.JIHE.Set.HashSet;

import java.util.HashSet;

public class TestStudent {
    public static void main(String[] args) {
        // 创建集合对象 该集合存储Student类型对象
        HashSet<Student> stuSet = new HashSet<>();
        // 存储
        Student student = new Student("小琳", 22);
        stuSet.add(student);
        stuSet.add(new Student("小王", 22));
        stuSet.add(new Student("小李", 21));
        for (Student student1 : stuSet) {
            System.out.println(student1);
        }
    }
}
