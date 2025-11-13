import java.util.Arrays;
import java.util.List;

public class LazyExecutionExample
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("java", "streams", "race car", "duke","json");

        names.stream()
                .filter(name ->
                {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("j");
                })
                .map(name ->
                {
                    System.out.println("Mapping: " + name);
                    return name.toUpperCase();
                });
    }
}
