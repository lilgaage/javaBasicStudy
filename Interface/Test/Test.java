package Interface.Test;

public class Test {

    public static void main(String[] args) {

        // 创建笔记本对象
        Laotop laotop = new Laotop();
        laotop.run(); //开机

        // 创建鼠标实体
        USB mouse = new Mouse();
        laotop.useUSB(mouse); // 笔记本使用鼠标

        // 创建键盘实体
        USB keyboard = new KeyBoard();
        laotop.useUSB(keyboard);

        laotop.shutDown(); // 关机
    }
    /*
    运行结果：
        开启笔记本
        鼠标开启，红灯闪一闪
        鼠标单击
        鼠标关闭，红灯熄灭
        键盘开启，绿灯闪一闪
        键盘打字
        键盘关闭，绿灯熄灭
        关闭笔记本
     */
}
