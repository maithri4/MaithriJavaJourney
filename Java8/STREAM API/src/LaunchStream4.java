import java.util.Arrays;
import java.util.List;

public class LaunchStream4
{
    public static void main(String[] args)
    {
        List<String> people = Arrays.asList("racecar", "mai","balu","amma","nanna");
        List<String> names =
                people.stream()
                        .map(name -> new StringBuilder(name).reverse().toString())
                        .toList();
        names.forEach(System.out::println);
    }
}
