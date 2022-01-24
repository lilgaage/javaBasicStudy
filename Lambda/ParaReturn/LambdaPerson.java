package Lambda.ParaReturn;

import java.util.Arrays;

public class LambdaPerson {
    public static void main(String[] args) {
        Person[] array = {
                new Person("小琳", 22),
                new Person("小李", 21),
                new Person("小王", 22)
        };
        Arrays.sort(array, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        for (Person person : array) {
            System.out.println(person);
        }
    }
}
