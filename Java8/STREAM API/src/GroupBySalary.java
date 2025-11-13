import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Student2
{
    private int id;
    private String name;
    private String gender;
    private double salary;

    public int getId() {
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(){
        this.gender=gender;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
    public Student2(int id, String name, String gender, double salary) {
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.salary=salary;
    }
    @Override
    public String toString() {
        return name;
    }
}
public class GroupBySalary
{
    public static void main(String[] args)
    {
        List<Student2> students = Arrays.asList(new Student2(100, "Jyothish","male",89000.00),
                                new Student2(101, "balu","male",89000.00),
                                new Student2(102, "rukmini","female",95000.00),
                                new Student2(103, "venky","male",125000.00),
                new Student2(104,"ramachandra","male",95000.00));

         Map<Double, List<Student2>> groupedBySalary = students.
                        stream().collect(Collectors.groupingBy(Student2::getSalary));
         Map<Boolean, List<Student2>> partitionBySalary =
                             students.stream()
                            .collect(Collectors.partitioningBy(student ->student.getSalary()>100000));

        System.out.println(groupedBySalary);
        System.out.println(partitionBySalary);

    }
}
