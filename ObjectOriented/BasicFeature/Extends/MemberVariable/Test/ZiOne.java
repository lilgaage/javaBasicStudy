package ObjectOriented.BasicFeature.Extends.MemberVariable.Test;

import ObjectOriented.BasicFeature.Extends.MemberVariable.Test.Fu;

class ZiOne extends Fu {
    int num2 = 6;

    public void show() {
        System.out.println("Fu name:" + num1); // 继承而来所以直接访问
        System.out.println("Zi name:" + num2);
    }
}