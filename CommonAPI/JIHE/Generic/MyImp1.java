package CommonAPI.JIHE.Generic;

// 定义类时确定泛型的类型
// 此时，泛型E的值就是String类型。
public class MyImp1 implements MyGenericInterface<String>{
    @Override
    public void add(String s) {

    }

    @Override
    public String getE() {
        return null;
    }
}
