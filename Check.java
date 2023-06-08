import java.util.HashMap;
import java.util.Map;

public class Check {
    public static void main(String[] args){
        Map<Integer, Person> obj = new HashMap<>();
        obj.put(1, new Person("Alice", 25));
        obj.put(2, new Person("Zlice", 25));
        for (Map.Entry<Integer, Person> entry : obj.entrySet()){
            Integer key = entry.getKey();
            Person value = entry.getValue();
        }
    }
}

class Person {
    public String name;
    public int age;

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