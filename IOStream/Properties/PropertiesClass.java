package IOStream.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesClass {
    /**
     *  Properties类
     * public Properties() 创建一个空的属性列表
     * public Object setProperty(String key, String value) 保存一对属性
     * public String getProperty(String key) 使用此属性列表中指定的键搜索属性值
     * public Set<String> stringPropertyNames() 所有键的名称的集合
     */
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.setProperty("filename", "a.txt");
        properties.setProperty("length", "20382890");
        properties.setProperty("location", "Study\\src\\IOStream\\Properties\\a.txt");
        System.out.println(properties);
        System.out.println(properties.getProperty("filename"));
        System.out.println(properties.getProperty("length"));
        System.out.println(properties.getProperty("location"));
        System.out.println(properties.getProperty("Name", "LilGaage")); // 不存在返回空，可设置默认值
        // 遍历属性集，获取所有键的集合 打印键值对
        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings) {
            System.out.println(key + "---" + properties.getProperty(key));
        }

        // 与流相关的方法 public void load(InputStream inStream)：从字节输入流中读取键值对
        // 参数中使用了字节输入流，通过流对象，可以关联到某文件上，这样就能加载文本中的数据了
        // 文本中的数据，必须是键值对形式，可以使用空格、等号、冒号等符号分隔
        Properties p = new Properties();
        p.load(new FileInputStream("Study\\src\\IOStream\\Properties\\a.txt"));
        Set<String> stringSet = p.stringPropertyNames();
        for (String key : stringSet) {
            System.out.println(key + "---" + p.getProperty(key));
        }
    }
}
