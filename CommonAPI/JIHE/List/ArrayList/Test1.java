package CommonAPI.JIHE.List.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Test1 {

    public static void main(String[] args){
        //生成6个1~33之间的随机整数,添加到集合,并遍历
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            int r = random.nextInt(33) + 1;
            list.add(r);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
