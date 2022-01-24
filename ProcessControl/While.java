package ProcessControl;

public class While {
    public static void main(String[] args){
        //输出十次名字
        int i = 1;
        while (i <= 10){
            System.out.println("第"+i+"次输出"+"lilgaage");
            i++;
        }


        //1-100之间的和
        int n = 1;
        int sum = 0;
        while (n <= 100){
            sum += n;
            n++;
        }
        System.out.println("1-100和为："+sum);


        //for 和 while 的小区别：
        //控制条件语句所控制的那个变量，在for循环结束后，就不能再被访问到了，而while循环结束还可以继
        //续使用，如果你想继续使用，就用while，否则推荐使用for。原因是for循环结束，该变量就从内存中消
        //失，能够提高内存的使用效率。
        //在已知循环次数的时候使用推荐使用for，循环次数未知的时推荐使用while。

    }
}
