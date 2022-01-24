package ObjectOriented.ClassObjectTest;

public class Phone {
    //成员变量
    String brand; //品牌
    int price;
    String color;

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void sendMassage(){
        System.out.println("群发短信");
    }


}
