package ProcessControl;

public class Switch {
    public static void main(String[] args){
        //定义变量，判断是周几
        int weekend = 6;
        switch (weekend){ //switch语句中，表达式类型可以是byte，short，int，char，enum（枚举），JDK7后可以接收字符串
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 6:
                System.out.println("周六");
                break;
            default:
                System.out.println("您输入的数字有误");
                break;
        }
    }
}
