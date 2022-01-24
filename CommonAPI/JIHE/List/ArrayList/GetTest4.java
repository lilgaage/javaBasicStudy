package CommonAPI.JIHE.List.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class GetTest4 {

    //定义获取所有偶数元素集合的方法(ArrayList类型作为返回值
    public static void main(String[] args){
        //创建random对象
        Random random = new Random();
        //创建ArrayList对象
        ArrayList<Integer> list = new ArrayList<>();
        //添加随机数到集合
        for (int i = 0; i < 20; i++){
            int r = random.nextInt(1000) + 1;
            list.add(r);
        }

        //调用偶数集合方法
        ArrayList<Integer> arraylist = getArrayList(list);
        System.out.println(arraylist);

    }

    public static ArrayList<Integer> getArrayList(ArrayList<Integer> list){

        //创建小集合，保存偶数
        ArrayList<Integer> samlllist = new ArrayList<>();

        // 遍历list
        for (int i = 0; i < list.size(); i++){
            //获取元素
            Integer num = list.get(i);
            // 判断偶数，添加到小集合中
            if (num % 2 == 0){
                samlllist.add(num);
            }
        }
        // 返回小集合
        return samlllist;
    }
}
