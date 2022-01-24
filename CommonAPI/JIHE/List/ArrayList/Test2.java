package CommonAPI.JIHE.List.ArrayList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args){
        //自定义4个学生对象,添加到集合,并遍历
        ArrayList<ObjectArray> list = new ArrayList<>();
        ObjectArray student1 = new ObjectArray("小刘", 21);
        ObjectArray student2 = new ObjectArray("小琳", 21);
        ObjectArray student3 = new ObjectArray("小凯", 21);
        ObjectArray student4 = new ObjectArray("小王", 21);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        for (int i = 0; i < list.size(); i++){
            ObjectArray s = list.get(i);
            System.out.println(s.getName() + s.getAge());
        }
    }
}
