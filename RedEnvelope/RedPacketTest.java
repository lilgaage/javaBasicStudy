package RedEnvelope;

public class RedPacketTest {

    public static void main(String[] args) {

        // 创建红包对象
        RedPacket redPacket = new RedPacket("大红包");

        // 设置群主名称
        redPacket.setOwnerName("LilGaage");

        // 设置红包类型
        redPacket.setOpenWay(new Common()); // 普通红包
//        redPacket.setOpenWay(new Lucky()); // 拼手气红包
    }
}
