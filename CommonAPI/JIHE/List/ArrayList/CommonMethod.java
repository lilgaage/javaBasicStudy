package CommonAPI.JIHE.List.ArrayList;

import java.util.ArrayList;

public class CommonMethod {
    /*
    对元素的操作基本体现在增、删、查
    public boolean add(E e) 指定元素添加到尾部
    public E remove(int index) 删除并返回指定元素
    public E get(int index) 返回获取的元素
    public int size 返回集合的元素数。遍历集合时，可以控制索引范围，防止越界。
     */
    public static void main(String[] args){
        //创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("吃饭");
        list.add("睡觉");
        list.add("打豆豆");

        //返回指定索引元素
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        //返回个数
        System.out.println(list.size());

        //删除并返回指定元素
        System.out.println("remove:" + list.remove(2));

        //遍历
        for (int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        list.add("打豆豆");

    }
}
