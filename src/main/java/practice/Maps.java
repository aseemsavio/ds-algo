package practice;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();
        map.put("aseem", new Person("Aseem Savio", 23));
        map.put("savio", new Person("Aseem Savio", 23));
        map.put("jon", new Person("Jon Snow", 28));
        map.put("arya", new Person("Arya Stark", 21));

        System.out.println(map.getOrDefault("ass", new Person("NILL", 0)).toString());

    }

}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
