import java.util.*;
import java.util.stream.Collectors;

class Person
{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    public String toString() {
        return name + "(" + age + ")";
    }
}

public class PartitioningExample
{
    public static void main(String[] args)
    {
        List<Person> people = Arrays.asList(
                new Person("Ram", 15),
                new Person("Mai", 23),
                new Person("Jyo", 35),
                new Person("Ravi", 12),
                new Person("Mohan", 17)
        );

        Map<Boolean, List<Person>> partitioned = people.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() >= 18));

        System.out.println("Adults : " + partitioned.get(true));
        System.out.println("Minors : " + partitioned.get(false));

        Map<Boolean, Long> countPartitioned = people.stream()
                .collect(Collectors.partitioningBy(p -> p.getAge() >= 18, Collectors.counting()));

        System.out.println(countPartitioned);
    }
}