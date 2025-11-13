import java.util.*;
import java.util.stream.Collectors;

record Student (String name, int marks){}

public class ListToMap
{
    public static void main(String[] args)
    {
        List<Student> students = Arrays.asList(new Student("Jyothish",89),
                                               new Student("Mai",94),
                                               new Student("Mai",98)
                                        );

        Map<String, Integer> map= students.stream()
            .collect(Collectors.toMap(Student::name, Student::marks, (first, second)->second));
        System.out.println(map);
    }
}
