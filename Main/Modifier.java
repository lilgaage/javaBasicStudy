package Main;

public class Modifier {
    /*
    java提供了四种访问权限，使用不同的访问权限修饰符修饰时，被修饰的内容会有不同的访问权限。
    public：公共的
    protected：受保护的
    default：默认的
    private：私有的
     */

    /*
    不同权限的访问能力：
                           public protected default（空的） private
        同一类中               1       1          1           1
        同一包中（子类与无关类）  1       1          1
        不同包的子类            1       1
        不同包中的无关类         1

        可见，public具有最大权限，private则是最小权限
        编写代码时，如果没有特殊的考虑，建议这样使用权限：
            成员变量使用private，隐藏细节
            构造方法使用public，方便创建对象
            成员方法使用public，方便调用方法
            不加权限修饰符，其访问能力与default修饰符相同
     */
}
