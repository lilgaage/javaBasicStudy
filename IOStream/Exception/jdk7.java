package IOStream.Exception;

import java.io.FileWriter;
import java.io.IOException;

public class jdk7 {
    /**
     *  jdk优化后的try-with-resource语句，该语句确保了每个资源在语句结束时关闭。
     *  所谓的资源（resource）是指在程序完成后，必须关闭的对象。
     *  格式：
     *      try(创建流对象语句，如果多个，使用分号;隔开) {
     *          // 读写数据
     *      } catch(IOException e) {
     *          e.printStackTrace();
     *      }
     *
     */
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("Study\\src\\IOStream\\Exception\\a.txt")) {
            fileWriter.write("LilGaage");
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
