import java.util.Arrays;
import java.util.List;

public class EmployeesStartingWith
{
    public static void main(String[] args)
    {
        List<String> employees = Arrays.asList("Jyothish", "Mai", "Venky","Balu","Ram","Rukmini","Apple","Sri");
        List<String> filteredEmps = employees.stream()
                .filter(emp->emp.startsWith("J") || emp.startsWith("R") || emp.startsWith("B") || emp.startsWith("M"))
                .toList();

        System.out.println(filteredEmps);
    }
}
