package ObjectOriented.BasicFeature.Polymorphic.Change;

public class TestAnimal {
    public static void main(String[] args) {
        // 向上转型
        Animal cat = new Cat();
        cat.eat(); // 调用的是Cat的eat

        // 向下转型
        Cat cat1 = (Cat) cat;
        cat1.catchMouse(); // 调用的是Cat的catchMouse

        // 转型的异常
//        Dog d = (Dog) cat;
//        d.watchHouse(); // 调用的是Dog的watchHouse,运行报错

        // 这段代码可以通过编译，但是运行时，却报出了 ClassCastException ，类型转换异常！
        // 这是因为明明创建了Cat类型对象，运行时是不可能转换成Dog对象的。
        // 为了避免该异常的发生，java提供了instanceof关键字，给引用变量做类型的校验。
            /*
            变量名 instanceof 数据类型
            如果变量属于该数据类型，返回true
            如果变量不属于该数据类型，返回false
            */
        if (cat instanceof Cat) {
            Cat c = (Cat) cat;
            c.catchMouse();
        } else if (cat instanceof Dog) {
            Dog d = (Dog) cat;
            d.watchHouse();
        }
    }
}
