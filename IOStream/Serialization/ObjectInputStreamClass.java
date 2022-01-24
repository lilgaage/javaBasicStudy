package IOStream.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamClass {
    /**
     *  ObjectInputStream反序列化流，将之前使用ObjectOutputStream序列化的原始数据恢复为对象
     *  构造方法：
     *      public ObjectInputStream(InputStream in) 创建一个指定InputStream的ObjectInputSTREAM
     *  反序列化操作1：
     *      如果能找到一个对象的class文件，我们可以进行反序列化操作，调用ObjectInputStram读取对象的方法
     *          public final Object readObject()：读取一个对象
     *      对于jvm可以反序列化对象，它必须是能够找到class文件的类，如果找不到会抛出ClassNotFoundException
     */
    public static void main(String[] args) {
        methodOne();

    }
    private static void methodOne() {
        Person person = null;
        try {
            // 创建反序列化流
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Study\\src\\IOStream\\Serialization\\person.txt"));
            // 读取一个对象
            person = (Person) ois.readObject();
            ois.close();
        } catch (IOException e) {
            e.getStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Person class not found");
            c.getStackTrace();
            return;
        }
        // 无异常 直接打印输出
        System.out.println(person.name); // 李张格
        System.out.println(person.address); // 湖北襄阳
        System.out.println(person.age); // 0
    }
}
