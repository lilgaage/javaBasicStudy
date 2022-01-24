package ObjectOriented.BasicFeature.Extends.MemberMethod.Test;

public class NewPhone extends Phone{
    // 重写父类的来电显示，并增加自己的显示姓名和图片功能
    public void showNum() {
        // 调用父类已经存在的功能使用super
        super.showNum(); //小贴士：这里重写时，用到super.父类成员方法，表示调用父类的成员方法。
        // 增加自己特有的显示姓名和图片功能
        System.out.println("显示来电姓名");
        System.out.println("显示头像");
    }
}
