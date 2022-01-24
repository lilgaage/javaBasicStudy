package ExceptionTry;

import javax.security.auth.login.LoginException;

// 自定义一个业务逻辑异常RegisterException，一个注册异常类。
// 要求：我们模拟注册操作，如果用户名已存在，则抛出异常并提示：亲，该用户名已经被注册。
public class CustomizeException extends Exception{

    /*
    自定义异常：
        java中不同的异常类，分别表示着某一种具体的异常情况，那么在开发中总有些异常情况是sun没有定义好的，
        此时我们根据自己业务的异常情况来定义异常类。例如年龄负数问题、考试成绩负数问题等。
    异常类如何定义：
        1.自定义一个编译期异常：自定义类，并继承于java.lang.Exception
        2.自定义一个运行时期的异常类：自定义类，并继承于java.lang.RuntimeException
     */


    // 空参构造
    public CustomizeException() {

    }
    /**
     * @param message 表示异常提示
     */
    public CustomizeException(String message) {
        super(message);
    }
    // 模拟登录操作，使用数组模拟数据库中存储的数据，并提供当前注册账号是否存在方法用于判断
    // 模拟数据库中已存在账号
    private static String[] names = {"lil", "gaage", "ghost"};

    public static void main(String[] args) {
        try {
            checkUsername("lil");
            System.out.println("注册成功");
        } catch (CustomizeException e) {
            e.printStackTrace();
        }
    }
    // 判断当前注册账号是否存在
    // 因为是编译期异常，又想调用者去处理 所以声明该异常
    public static boolean checkUsername(String uname) throws CustomizeException {
        for (String name: names) {
            if (name.equals(uname)) {
                throw new CustomizeException("亲" + name + "已经被注册了！");
            }
        }
        return true;
    }
}
