import java.util.*;
import java.util.stream.Collectors;

class Student1
{
    private String name;
    private String gender;

    public Student1(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
public class GroupStudentsByGender
{
    public static void main(String[] args)
    {
        List<Student1> students =
                Arrays.asList(new Student1("venky","male"),
                new Student1("Apple", "female"),
                new Student1("balu","male"),
                        new Student1("mai","female"),
                        new Student1("jyothish","male"));

        Map<String, List<Student1>> groupedStudents =
                students.stream()
                        .collect(Collectors.groupingBy(Student1::getGender));
        System.out.println(groupedStudents);

        Map<String,Long> studentsInEachGroup =
                students.stream()
                        .collect(Collectors.groupingBy(Student1::getGender, Collectors.counting()));
        System.out.println(studentsInEachGroup);
    }
}
