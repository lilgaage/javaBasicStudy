package ObjectOriented.BasicFeature.Polymorphic;


public class Define {

    // 同一行为，不同的事物可以体现出不同的形态
    /*
    多态：同一行为，具有多个不同的表现形式
    前提：
        1.继承或实现【二选一】
        2.方法的重写【不重写将毫无意义】
        3.父类引用指向子类对象【格式体现】
     */

    /*
    多态的体现格式：
        父类类型 变量名 = new 子类对象;
        变量名.方法名()
     */
    // 父类类型：子类对象继承的父类类型，或者实现的父接口类型
//    Fu f = new Zi();
//    f.method();



    // 当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，执行的是子类重写后的方法
    // 定义父类
//    public abstract class Animal {
//        public abstract void eat();
//    }
//    // 定义子类
//    public Cat extends Animal {
//        public void eat() {
//            System.out.println("吃鱼");
//        }
//    }
//    public Dog extends Animal {
//        public void eat() {
//            System.out.println("吃骨头");
//        }
//    }
//    // 定义测试类
//    public class Test {
//        public static void main(String[] args) {
//            // 多态形式，创建对象
//            Animal animal1 = new Cat();
//            animal1.eat(); // 调用的是Cat的eat
//            Animal animal2 = new Dog();
//            animal2.eat(); // 调用的是Dog的eat
//        }
//    }


}
