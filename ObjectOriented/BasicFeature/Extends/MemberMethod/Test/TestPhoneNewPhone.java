package ObjectOriented.BasicFeature.Extends.MemberMethod.Test;

public class TestPhoneNewPhone {
    public static void main(String[] args) {
        // 创建子类对象
        NewPhone newPhone = new NewPhone();
        // 调用父类
        newPhone.call();
        // 调用子类重写的方法
        newPhone.showNum();
    }
}
