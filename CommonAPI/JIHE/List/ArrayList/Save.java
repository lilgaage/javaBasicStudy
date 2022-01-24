package CommonAPI.JIHE.List.ArrayList;

import java.util.ArrayList;

public class Save {
    /*
    ArrayList对象不能存储基本类型，只能存储引用类型的数据。类似<int>不能写，但是可以存储基本数据类型对应的包装类型
    所以想要存储基本类型数据，<>中的数据类型必须转换后才能编写

        基本类型        基本类型包装类
        byte            Byte
        short           Short
        int             Integer
        long            Long
        float           Float
        double          Double
        char            Character
        boolean         Boolean
     */
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
