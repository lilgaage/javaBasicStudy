package IOStream.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamClass implements Serializable {
    /**
     *  java.io.ObjectOutputStream类，将java对象的原始数据类型写出到文件，实现对象的持久存储
     *  构造方法：
     *      public ObjectOutputStream(OutputStream out) 创建一个指定OutputStream的ObjectOutputStream
     *
     *  序列化操作：
     *      一个对象想要序列化，必须满足两个条件
     *          1.该类必须实现java.io.Serializable接口，Serializable是一个标记接口，
     *          不实现此类的接口不会使用任何状态序列化或反序列化，会抛出NotSerializableException
     *          2.该类的所有属性必须是可序列化的。如果有一个属性不需要可序列化的，则该属性必须注明是瞬态的，
     *          使用transient关键字修饰。
     *
     *  写出对象方法：public final void writeObject(Object obj) 将指定对象写出
     */

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "李张格";
        person.address = "湖北襄阳";
        person.age = 21;
        try {
            // 创建序列化流对象
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Study\\src\\IOStream\\Serialization\\person.txt"));
            // 写出对象
            out.writeObject(person);
            out.close();
            System.out.println("Serialized data is saved"); // 姓名，地址被序列化，年龄没有被序列化。
        } catch (IOException exception) {
            exception.getStackTrace();
        }
    }
}
