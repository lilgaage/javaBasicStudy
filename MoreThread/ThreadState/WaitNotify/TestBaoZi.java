package MoreThread.ThreadState.WaitNotify;

public class TestBaoZi {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        ChiHuo chiHuo = new ChiHuo("吃货", baoZi);
        BaoZiPu baoZiPu = new BaoZiPu("包子铺", baoZi);
        chiHuo.start();
        baoZiPu.start();
    }
}
