package MethodReferences;

public class LambdaRedundancy {
    /**
     *  在使用Lambda表达式的时候，我们实际上传递进去的代码就是一种解决方案：拿什么参数做什么操作。
     *  那么考虑一种情况：如果在Lambda中所指定的操作方案，已经有地方存在相同方案，那就没有必要再写重复逻辑了。
     */
    // 在Printable接口当中唯一的抽象方法print接收一个字符串参数，目的就是为了打印显示它。
    // 那么通过Lambda来使用它的代码很简单。
    private static void printString(Printable data) {
        data.print("LilGaage");
    }

    public static void main(String[] args) {
        printString(str -> System.out.println(str)); // Lambda方式
        printString(System.out::println); // 方法引用
        /**
         *  其中printString方法只管调用Printable接口的print方法，而并不管print方法的具体实现逻辑会将字符串打印到什么地方去。
         *  而main方法通过Lambda表达式指定了函数式接口Printable的具体操作方案为：
         *      拿到String数据后，在控制台输出。
         *  Lambda对字符串控制台打印输出的操作方案，明明已经有了现成的实现，那就是System.out对象中的println(String)方法，
         *  既然Lambda希望做的事情就是调用println(String)方法，那就不需要自己手动调用。
         *  省去Lambda的语法格式，只需要“引用”
         *
         *
         *  双冒号::叫做“方法引用”，如果Lambda要表达的函数方案已经存在于某个方法的实现中，那么则可以通过::来引用该方法作为Lambda的替代者。
         *  例如上例中，System.out对象中有一个重载的println(String)方法恰好是我们所需要的。
         *  那么对于printString方法的函数式接口参数，s -> System.out.println(s)等效于System.out::println
         *  第一种语义是指拿到参数之后经Lambda之手，继而传递给System.out.println方法去处理
         *  第二种是直接让System.out中的println方法来取代Lambda。
         *  注：Lambda中传递的参数一定是方法引用中的那个方法可以接收的类型，否则会抛出异常
         *
         *
         *  推导与省略
         *  如果使用Lambda，那么根据“可推导就是可省略”的原则，无需指定参数类型，也无需指定重载形式
         *  ---它们都将被自动推导。而如果使用方法引用，也是同样可以根据上下文进行推导。
         *  函数式接口是Lambda的基础，而方法引用是Lambda的孪生兄弟。
         */
        printInteger(System.out::println); // 该方法引用会自动匹配到println(int)的重载形式
        // 将函数式接口改为int类型的参数，由于上下文变了之后可以自动推导出唯一对应的匹配重载，所以方法引用没有任何变化。
    }
    private static void printInteger(PrintableInteger data) {
        data.print(213);
    }
}
