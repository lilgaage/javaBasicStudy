package ObjectOriented.BasicFeature.Extends.Test;

public class TestEmployeeTeacher {
    public static void main(String[] args) {
        // 创建一个讲师对象
        Teacher teacher = new Teacher();
        teacher.name = "小琳";
        teacher.printName(); // 调用子类方法
        teacher.work(); // 调用父类方法
    }
}
