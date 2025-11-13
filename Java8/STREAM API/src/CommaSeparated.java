import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparated
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("race-car","jyothish","venky","tirumala");
        String s = words.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(s);
    }
}
