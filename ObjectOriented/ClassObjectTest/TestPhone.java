package ObjectOriented.ClassObjectTest;

public class TestPhone {
    public static void main(String[] args){
        //创建对象
        Phone phone = new Phone();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();

        System.out.println(phone.brand); //null
        System.out.println(phone.price); //0
        System.out.println(phone.color); //null

        phone.brand = "MyIPHONE";
        phone.price = 6000;
        phone.color = "purple";

        phone1.brand = "小刘的iPhone";
        phone1.price = 6000;
        phone1.color = "white";
        System.out.println(phone1.brand);

        phone2.brand = "小李的iPhone";
        phone2.price = 6000;
        phone2.color = "yellow";
        show(phone2);

        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);

        phone.call("lilgaage");
        phone.sendMassage();
        phone1.call("ghost");
    }
    public static void show(Phone phone2){
        System.out.println("品牌：" + phone2.brand
                        + "价格：" + phone2.price
                        + "颜色：" + phone2.color);
    }
    /*
    在栈内存中运行的方法，遵循“先进后出，后进先出”的原则。变量phone指向堆内存中的空间，寻找方法信息，去执行该方法
    对象调用方法时，根据对象中方法标记（地址值），去类中寻找方法信息。那怕是多个对象，方法信息也只保存一份，节约内存空间
    引用类型作为参数时，传递的是地址值
     */
}
