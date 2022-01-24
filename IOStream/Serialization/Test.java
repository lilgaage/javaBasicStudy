package IOStream.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {
    /**
     *  1. 将存有多个自定义对象的集合序列化操作，保存到 list.txt 文件中。
     *  2. 反序列化 list.txt ，并遍历集合，打印对象信息。
     */
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("小琳", "福建厦门",22);
        Person person2 = new Person("小李", "广东广州",21);
        Person person3 = new Person("小刘", "湖北襄阳",21);
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);
        // 序列化
//        serializ(peopleList);
        // 反序列化
        antiSerializ(peopleList);

    }


    private static void serializ(ArrayList<Person> list) throws Exception {
        // 创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Study\\src\\IOStream\\Serialization\\list.txt"));
        // 写出对象
        oos.writeObject(list);
        oos.close();
    }

    private static void antiSerializ(ArrayList<Person> list) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Study\\src\\IOStream\\Serialization\\list.txt"));
        // 读取对象，强制转换为ArraList类型
        list = (ArrayList<Person>) ois.readObject();
        for (int i = 0; i < list.size(); i++) {
            Person person = list.get(i);
            System.out.println(person.getName() + "---" + person.getAddress());
        }
    }
}
