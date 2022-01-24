package Lambda.Test.NoParaNoReturn;

public class Test {
    public static void main(String[] args) {

        invokeCoook(() -> {
            System.out.println("吃饭啦！");
        });
    }
    private static void invokeCoook(Cook cook) {
        cook.makeFood();
    }
}
