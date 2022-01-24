package CommonAPI.Static;

public class StaticMethod {
    /*
    当static修饰成员方法时，该方法称为类方法
    静态方法在生命中static，建议使用类名来调用，而不需要创建类的对象
    类方法：使用static关键字修饰的成员方法，习惯称为静态方法

    定义格式：
        修饰符 static 返回值类型 方法名 （参数列表）{
            // 执行语句
        }
     */

    // 在类中定义静态方法
    public static void showNum(){
        System.out.println("num:" + ClassVariable.numberOfStudent);
    }

    /*
    静态方法调用的注意事项：
        静态方法可以直接访问类变量和静态方法
        静态方法不能直接访问普通成员变量或成员方法。反之，成员方法可以直接访问类变量或静态方法
        静态方法中，不能使用this关键字
        静态方法只能访问静态成员


    调用格式：
        被static修饰的成员可以并且建议通过类名直接访问。
        虽然也可以通过对象名访问静态成员，原因即多个对象属于一个类共享使用同一个静态成员，但是不建议，会出现警告信息。
        // 访问类变量
            类名.类变量名;
        // 调用静态方法
            类名.静态方法名（参数）;
     */

    public static void main(String[] args) {
        // 访问类变量
        System.out.println(ClassVariable.numberOfStudent);
        // 调用静态方法
        StaticMethod.showNum();
    }
}
