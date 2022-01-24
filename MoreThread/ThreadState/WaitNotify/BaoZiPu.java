package MoreThread.ThreadState.WaitNotify;

public class BaoZiPu extends Thread{
    private BaoZi baoZi;
    public BaoZiPu(String name, BaoZi baoZi) {
        super(name);
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        // 造包子
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == true) { // 包子资源存在
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 没有包子 造包子
                System.out.println("包子铺开始做包子");
                if (count % 2 == 0) {
                    baoZi.pier = "冰皮";
                    baoZi.xianer = "五仁";
                } else {
                    baoZi.pier = "薄皮";
                    baoZi.xianer = "牛肉大葱";
                }
                count++;
                baoZi.flag = true;
                System.out.println(baoZi.pier + baoZi.xianer + "包子造好了");
                System.out.println("吃货来吃吧");
                baoZi.notify(); // 唤醒吃货
            }
        }
    }
}
