package CommonAPI.JIHE.Generic;

// 含有泛型的接口
// 定义格式：修饰符 interface 接口名 <代表泛型的变量> {}
public interface MyGenericInterface <E>{

    public abstract void add(E e);
    public abstract E getE();
}
