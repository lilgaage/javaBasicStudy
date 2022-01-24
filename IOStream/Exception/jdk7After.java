package IOStream.Exception;

import java.io.FileWriter;
import java.io.IOException;

public class jdk7After {
    public static void main(String[] args) {
        // 声明变量
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Study\\src\\IOStream\\Exception\\a.txt");
            fileWriter.write("李张格");
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }
}
