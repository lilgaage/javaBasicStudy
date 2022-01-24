package ObjectOriented.BasicFeature.Extends.MemberVariable.Test;

import ObjectOriented.BasicFeature.Extends.MemberVariable.Test.Fu;

class ZiTwo extends Fu {
    int num1 = 6;
    public void show() {
        System.out.println("Fu name: " + num1);
        System.out.println("Zi name: " + num1);
    }
    // 子类出现了父类同名的成员变量时，在子类中需要访问父类非私有成员变量时，
    // 需要使用super关键字，修饰父类成员变量，相当于this
    // 使用格式： super.父类成员变量名
    public void showSuper() {
        System.out.println("Fu name:" + super.num1); //父类num1
        System.out.println("Zi name:" + this.num1); //子类num1
    }
}
