package InnerClass;

public class Define {
    /*
    内部类：将一个类A定义在另一个类B里面，里面那个类A就成为内部类，B则称为外部类

    成员内部类---定义在类中方法外的类：
        class 外部类 {
            class 内部类 {
            }
        } // 在描述事物时，若一个事物内部还包含其他事物，就可以使用内部类这种结构
             比如汽车类Car中包含发动机类Engine，这时，Engine就可以使用内部类来描述，定义在成员位置。

     访问特点：
        1.内部类可以直接访问外部类的成员，包括私有成员
        2.外部类要放温暖内部类的成员，必须要建立内部类的对象
        创建内部类对象格式：
            外部类名.内部类名 对象名 = new 外部类型().new 内部类型();
     */
    private boolean live = true;
    class Heart {
        public  void jump() {
            // 直接访问外部类成员
            if (live) {
                System.out.println("心脏在跳动");
            } else {
                System.out.println("心脏不跳了");
            }
        }
    }
    public boolean isLive() {
        return live;
    }
    public void setLive(boolean live) {
        this.live = live;
    }

    public static void main(String[] args) {
        // 创建外部类对象
        Define define = new Define();
        // 创建内部类对象
        Heart heart = define.new Heart();
        heart.jump();
        define.setLive(false);
        heart.jump();
    }

    // 内部类仍然是一个独立的类，在编译后内部类会被编译成独立的.class文件，但是前面冠以外部类的类名和￥符号
    // 比如 Define$Heart.class
}
