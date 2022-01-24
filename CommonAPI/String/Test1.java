package CommonAPI.String;

public class Test1 {
    // 定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = PinJie(arr);
        System.out.println(s); //[1#2#3]

    }

    /*
    两个明确：
        返回值明确：String，返回拼接的字符串
        参数列表：int[] arr,传参{1，2，3}
     */
    public static String PinJie(int[] arr){
        // 创建字符串s
        String s = new String("[");
        // 遍历数组，并拼接字符串
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                s = s.concat(arr[i] + "]");
            }else {
                s = s.concat(arr[i] + "#");
            }
        }
        return s;
    }
}
