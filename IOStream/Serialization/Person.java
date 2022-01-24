package IOStream.Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    /**
     *   反序列化操作2：
     *      另外，当jvm反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，
     *      那么反序列化操作也会失败，会抛出InvalidClassException。发生这个异常的原因如下：
     *          该类的序列版本号与从流中读取的类描述符的版本号不匹配
     *          该类包含位置数据类型
     *          该类没有可访问的无参构造方法
     *      Serializable接口给需要序列化的类，提供了一个序列版本号。
     *      serialVersionUID该版本号的目的在于验证序列化的对象和对应类是否版本匹配
     */
    // 加入序列版本号
    private static final long serialVersionUID = 1L;
    // 添加新的属性，重新编译，可以反序列化，该属性为默认值
    public int eid;
    public String name;
    public String address;
    public transient int age; // transient瞬态修饰成员，不会被序列化
    public void addressCheck() {
        System.out.println("Address check" + name + "---" + address);
    }

    public Person() {
    }

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ObjectOutputStreamClass{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
