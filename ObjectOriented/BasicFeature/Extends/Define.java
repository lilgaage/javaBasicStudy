package ObjectOriented.BasicFeature.Extends;

public class Define {
    /*
    多个类中存在相同属性和行为时，将这些内容抽取到单独一个类中，
    那么多个类无需再定义这些属性和行为，只要继承那一个类即可。

    其中，多个类可以称为子类，单独那一个类称为父类、超类（superclass）或者基类
    继承描述的是事物之间的所属关系，这种关系是is-a的关系。
    例如兔子属于食草动物、食草动物属于动物。可见，父类更通用，子类更具体
    通过继承，可以使多种事物之间形成一种关系体系

    定义：
        继承就是子类继承父类的属性和行为，使得子类对象具有与父类相同的属性、相同的行为。
        子类可以直接访问父类钟的非私有的属性和行为
    好处：
        提高代码的复用性
        类与类之间产生了关系，是多态的前提。
    格式：
        class 父类{
            ...
        }
        class 子类 extends 父类{
            ...
        }
    特点：
        1.Java只支持单继承，不支持多继承
            一个类只能有一个父类，不能有多个父类
                class C extends A{}      //ok
                class C extends A, B...  //error
        2.Java支持多层继承
            class A{}
            class B extends A{}
            class C extends B{}
            顶层父类是Object类。所有的类都默认继承Object，作为父类。
        3.子类和父类是一种相对的概念
     */

}
