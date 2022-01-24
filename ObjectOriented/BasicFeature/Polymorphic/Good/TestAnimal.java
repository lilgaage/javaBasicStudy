package ObjectOriented.BasicFeature.Polymorphic.Good;

public class TestAnimal {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Dog dog = new Dog();
        Animal cat = new Cat();
        Animal dog = new Dog();

//        // 调用show方法
//        showCatEat(cat);
//        showDogEat(dog);

        // 以上两个方法都可被showAnimalEat（Animal animal）所替代,执行结果一致
        showAnimalEat(cat);
        showAnimalEat(dog);
        /*
        1.由于多态特性的支持，showAnimalEat方法的Animal类型，是Cat和Dog的父类类型，
        父类类型接收子类对象，当然可以把Cat对象和Dog对象传递给方法。
        2.当eat方法执行时，多态规定，执行的是子类重写的方法，那么效果自然与showCatEat、showDogEat方法一致，
        所以showAnimalEat完全可以替代以上两种方法。
        3.不仅仅是替代，在扩展性方面，无论之后再多的子类出现，都不需要编写showXxxEat方法了，直接使用showAnimalEat方法就可以
        4.所以多态的好处体现在可以使程序编写的更简单，并有良好的扩展性。

         */
    }

    public static void showCatEat (Cat cat) {
        cat.eat();
    }

    public static void showDogEat (Dog dog) {
        dog.eat();
    }

    public static void showAnimalEat (Animal animal) {
        animal.eat();
    }
}
