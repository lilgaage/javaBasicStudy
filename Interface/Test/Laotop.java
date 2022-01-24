package Interface.Test;

public class Laotop {

    // 笔记本开启运行功能
    public void run() {
        System.out.println("开启笔记本");
    }

    // 笔记本使用USB设备，当笔记本对象调用这个功能时，必须给其传递一个符合USB规则的USB设备
    public void useUSB(USB usb) {
        // 判断是否有usb设备
        if (usb != null) {
            usb.open();
            // 类型转换，调用特有方法
            if (usb instanceof Mouse) {
                Mouse mouse = (Mouse) usb;
                mouse.click();
            } else if (usb instanceof KeyBoard) {
                KeyBoard keyBoard = (KeyBoard) usb;
                keyBoard.type();
            }
            usb.close();
        }
    }

    public void shutDown() {
        System.out.println("关闭笔记本");
    }
}
