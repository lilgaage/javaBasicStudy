package ObjectOriented.BasicFeature.Extends.MemberVariable.Test;

import ObjectOriented.BasicFeature.Extends.MemberVariable.Test.ZiTwo;

public class TestFuZiTwo {
    public static void main(String[] args) {
        ZiTwo ziTwo = new ZiTwo();
        ziTwo.show();
        /*
        Fu name: 6
        Zi name: 6
         */
        ziTwo.showSuper();
        /*
        Fu name:5
        Zi name:6
         */
    }
}
