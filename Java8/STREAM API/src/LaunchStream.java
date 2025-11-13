import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LaunchStream
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Jyothish", "race car", "My","Venky","Apple");

       Stream<String> names = list.stream()
                 .map(String::toUpperCase)
                 .sorted()
               .limit(4)
               .distinct();
        names.forEach(System.out::println);
    }
}
