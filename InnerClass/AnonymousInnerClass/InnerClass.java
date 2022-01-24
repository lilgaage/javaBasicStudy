package InnerClass.AnonymousInnerClass;

public class InnerClass {
    public static void main(String[] args) {
        /*
        等号右边：匿名内部类，定义并创建该接口的子类对象
        等号左边：是多态赋值，接口类型引用指向子类对象
         */
        FlyAble flyAble = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("我飞了");
            }
        };
        // 执行重写后的方法
        flyAble.fly();


        // 通常在方法的形参是接口或者抽象类时，也可将匿名内部类作为参数传递
        // 将flyAble传递给showFly方法中
        showFly(flyAble);



        // 以上两步可简化成一步
        // 创建匿名内部类，直接传递给showFly（FlyAble flyAble）
        showFly(new FlyAble() {
            @Override
            public void fly() {
                System.out.println("我飞了");
            }
        });
    }

    public static void showFly(FlyAble flyAble) {
        flyAble.fly();
    }
}
