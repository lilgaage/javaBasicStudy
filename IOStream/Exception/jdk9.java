package IOStream.Exception;

import io.opentelemetry.sdk.resources.Resource;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class jdk9 {
    /**
     *  jdk9中try-with-resource的改进，对于引入对象的方式支持的更加简洁。
     *  被引入的对象她那个有可以自动关闭，无需手动close
     *  改进前格式：
     *      final Resource resource1 = new Resource("resource1"); // 被final修饰的对象
     *      Resource resource2 = new Resource("resource2"); // 普通对象
     *      // 引入方式：创建新的变量保存
     *      try (Resource r1 = resource1);(Resource r2 = resource2) {
     *          // 使用对象
     *      }
     *  改进后格式：
     *      final Resource resource1 = new Resource("resource1");
     *      Resource resource2 = new Resource("resource2");
     *      // 引入方式：直接引入
     *      try(resource1;resource2) {
     *          // 使用对象
     *      }
     */

    public static void main(String[] args) throws IOException{
        final FileReader fr = new FileReader("Study\\src\\IOStream\\Exception\\in.txt");
        FileWriter fw = new FileWriter("Study\\src\\IOStream\\Exception\\out.txt");
        try(fr; fw) {
            int b;
            while ((b = fr.read()) != -1) {
                fw.write(b);
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
