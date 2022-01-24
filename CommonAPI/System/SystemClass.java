package CommonAPI.System;

public class SystemClass {
    /*
    java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作
    常用方法：
        public static long currentTimeMillis() :返回以毫秒为单位的当前时间
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length): 将数组中指定的数据拷贝到另一个数组中
            参数:
                src - 源数组。
                srcPos - 源数组中的起始位置(起始索引)。
                dest - 目标数组。
                destPos - 目标数据中的起始位置。
                length - 要复制的数组元素的数量。
     */
    public static void main(String[] args) {
        // 获取当前时间的毫秒值
        System.out.println(System.currentTimeMillis()); // 1641286392533
    }
}
