import java.util.*;

public class AnyStringStartsWithA
{
    public static void main(String[] args)
    {

        List<String> names = Arrays.asList("Ashoka","Mai","ram","apple","Car");
        boolean anyMatch =
               names.stream()
                .anyMatch(name->name.startsWith("A"));
        System.out.println(anyMatch);
    }
}
