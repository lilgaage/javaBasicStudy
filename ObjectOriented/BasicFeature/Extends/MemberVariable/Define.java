package ObjectOriented.BasicFeature.Extends.MemberVariable;

public class Define {
    /*
    当类之间产生了关系后，其中各类中的成员变量，又产生了哪些影响？
     */

    // 成员变量不重名
    // 如果子类父类中出现不重名的成员变量，这时的访问是没有影响的
    // 代码见TestFuZiOne

    //成员变量重名
    //如果子类父类中出现重名的成员变量，这时的访问是有影响的。
    // 代码见TestFuZiTwo

    /*
    小贴士：Fu 类中的成员变量是非私有的，子类中可以直接访问。
    若Fu 类中的成员变量私有了，子类是不能直接访问的。
    通常编码时，我们遵循封装的原则，使用private修饰成员变量，
    那么访问父类的私有成员变量可以在父类中提供公共的getXxx方法和setXxx方法。
     */

}
