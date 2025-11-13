import java.util.Arrays;
import java.util.List;

public class ConvertToUppercase
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("apple","jyothish","ram","sriram","venkateswara");

        List<String> upperNames =
                 names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperNames);
    }
}
