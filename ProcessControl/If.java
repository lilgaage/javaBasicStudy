package ProcessControl;

public class If {
    public static void main(String[] args){
        System.out.println("开始");
        //定义两个变量
        int a = 10;
        int b = 20;
        //变量使用if判断
        if (a == b){
            System.out.println("a等于b");
        }
        int c = 10;
        if (a == c){
            System.out.println("a等于c");
        }
        System.out.println("结束");


        //判断给定的数据是奇数还是偶数
        int d = 39;
        if (d % 2 == 0){
            System.out.println("d是偶数");
        }else {
            System.out.println("d是奇数");
        }


        //x和y的关系满足如下：
        //>=3 y = 2x + 1;
        //‐1<=x<3 y = 2x;
        //x<=‐1 y = 2x – 1;
        //根据给定的x的值，计算出y的值并输出。
        int x = 5;
        int y;
        if (x >= 3){
            y = 2 * x + 1;
        }else if (x >= -1 && x < 3){
            y = 2 * x;
        }else {
            y = 2 * x - 1;
        }
        System.out.println("y的值是"+y);


        //指定考试成绩，判断学生等级
        //90-100 优秀
        //80-89 好
        //70-79 良
        //60-69 及格
        //60以下 不及格
        int score = 90;
        if (score >= 0 && score <=100){
            if (score >= 90){
                System.out.println("该生成绩优秀");
            }else if (score >= 80){
                System.out.println("该生成绩等级为好");
            }else if (score >= 70){
                System.out.println("该生成绩为良");
            }else if (score >= 60){
                System.out.println("该生成绩及格");
            }else {
                System.out.println("该生成绩不及格");
            }
        }else {
            System.out.println("输入不合法，请重新输入");
        }


        //if语句和三元运算符的互换
        int i = 10;
        int n = 20;
        //定义变量，保存a和b的较大值
        int k;
        if (i > n){
            k = i;
        }else {
            k = n;
        }
        //三元表达式
        k = i > n ? i : n;
        System.out.println(k);






    }
}
