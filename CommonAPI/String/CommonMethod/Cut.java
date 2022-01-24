package CommonAPI.String.CommonMethod;

import java.util.Arrays;

public class Cut {
    public static void main(String[] args) {
        // 创建字符串对象
        String s = "lil|gaa|ge";
        String[] strArray = s.split("\\|"); //[lil, gaa, ge]
        for (int i = 0; i < strArray.length; i++){
            System.out.println(strArray[i]);
        }
    }
}