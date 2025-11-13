package comparator_vs_comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class LaunchComparator
{
    public static void main(String[] args)
    {
        Student[] students = {
                new Student("Jyothish", 21),
                new Student("Mai", 20),
                new Student("Venky", 99),
                new Student("Balu", 25),
                new Student("Sriram", 44)
        };

        Comparator<Student> compareByAge = Comparator.comparingInt(Student::getAge);

        Arrays.sort(students, compareByAge);
        for(Student student : students)
            System.out.println(student.getName()+" | "+student.getAge());
    }
}
