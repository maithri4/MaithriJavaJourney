import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary)
    {
        this.name = name;
        this.salary = salary;
    }
}

public class FilterEmployees
{
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Alice", 60000),
                new Employee("Bob", 45000));

        List<Employee> highEarners =
                 employees.stream()
                         .filter(e -> e.salary > 50000)
                           .toList();
        
        highEarners.forEach(e -> System.out.println(e.name));
    }
}