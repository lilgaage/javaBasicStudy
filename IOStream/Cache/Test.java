package IOStream.Cache;

import java.io.*;
import java.util.HashMap;

public class Test {
    // 文本排序
    public static void main(String[] args) throws IOException {
        // 创建map集合没保存文本数据，键为序号，值为数字
        HashMap<String, String> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("Study\\src\\IOStream\\Cache\\before.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("Study\\src\\IOStream\\Cache\\after.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split("\\.");
            map.put(split[0], split[1]);
        }
        br.close();
        for (int i = 0; i < map.size(); i++) {
            String key = String.valueOf(i + 1);
            String value = map.get(key);
            bw.write(key + "." + value);
            bw.newLine();
        }
        bw.close();
    }
}
