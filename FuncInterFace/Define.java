package FuncInterFace;

public class Define {
    /**
     *  函数式接口在java中指： 有且仅有一个抽象方法的接口
     *  函数式接口，即适用于函数式编程场景的接口。而java中的函数式编程体系那就是Lanbda，
     *  所以函数式接口就是可以适用于Lambda使用的接口。只有确保接口中有且仅有一个抽象方法，
     *  java中的Lambda才能顺利地进行推导。
     *
     *  “语法糖”是指使用更加方便，但是原理不变的代码语法。例如在遍历集合时使用的for-each语法，
     *  其实底层的实现原理仍然是迭代器，这便是“语法糖”。从应用层面上来讲，
     *  java中的Lambda可以被当做是匿名内部类的“语法糖”，但是二者在原理上是不同的。
     *
     *
     *  格式： ---只要确保接口中仅有一个抽象方法即可
     *      修饰符 interface 接口名称 {
     *          public abstract 返回值类型 方法名称(可选参数信息);
     *          // 其他非抽象方法内容
     *      }
     *
     *  由于接口中抽象方法的public abstract是可以省略的，所以定义一个函数式接口很简单
     *  public interface MyFuncInterFace {
     *      void myMethod();
     *  }
     */
}
