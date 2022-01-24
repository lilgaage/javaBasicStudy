package ObjectOriented.BasicFeature.Package;

public class This {
    // 我们发现 setXxx 方法中的形参名字并不符合见名知意的规定，那么如果修改与成员变量名一致，是否就见名知意了呢？
//    private String name;
//    private int age;
//    public void setName(String name){
//        name = name;
//    }
//    public void setAge(int age){
//        age = age;
//    }
    /*
    经过修改和测试，我们发现新的问题，成员变量赋值失败了。
    也就是说，在修改了 setXxx() 的形参变量名后，方法并没有给成员变量赋值！
    这是由于形参变量名与成员变量名重名，导致成员变量名被隐藏，方法中的变量名，无法访问到成员变量，从而赋值失败。
    所以，我们只能使用this关键字，来解决这个重名问题。
     */

    // this代表所在类的当前对象的引用（地址值），即对象自己的引用
    // 方法被哪个对象调用，方法中的this就代表哪个对象。即谁在调用，this就代表谁
    // 使用格式： this.成员变量名;
    // 使用this修饰方法中的变量，解决成员变量被隐藏的问题
    private String name;
    private int age;
    public  void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    // 小贴士：方法中只有一个变量名时，默认也是使用 this 修饰，可以省略不写。
}
