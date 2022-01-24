package CommonAPI.JIHE.List.ArrayList;

public class ObjectArray {
    private String name;
    private int age;

    public ObjectArray(){}

    public ObjectArray(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args){
        //创建学生数组
        ObjectArray[] student = new ObjectArray[3];

        //创建学生对象
        ObjectArray s1 = new ObjectArray("小刘", 21);
        ObjectArray s2 = new ObjectArray("小琳", 22);
        ObjectArray s3 = new ObjectArray("小凯", 23);

        //把学生对象作为元素赋值给学生数组
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        //遍历学生数组
        for (int i = 0; i < student.length; i++){
            ObjectArray s = student[i];
            System.out.println(s.getName() + s.getAge());
        }

    }
}
