import java.util.Arrays;
import java.util.List;

public class StartsWithS
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("mai","apple","balu","venky");
        List<String> upperNames = names.stream().map(String::toUpperCase).toList();
        System.out.println(upperNames);
    }
}
