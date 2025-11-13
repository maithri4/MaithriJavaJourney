package comparator_vs_comparable;

import java.util.Arrays;

class Person implements Comparable<Person>{
     String name;
     int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Person that){
         return Integer.compare(this.age, that.age);
        //return this.age > that.age?1:-1;
    }
}
public class LaunchComparable {
    public static void main(String[] args)
    {

        Person[] people = {
                new Person("Jyothish", 21),
                new Person("Maithri", 20),
                new Person("Venky", 89),
                new Person("Sriram", 44)
        };

        Arrays.sort(people);
        for(Person person : people)
            System.out.println(person.getName());
    }
}
