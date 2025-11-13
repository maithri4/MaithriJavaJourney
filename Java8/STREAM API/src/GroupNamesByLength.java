import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNamesByLength
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("apple","venky","tml","engineer","sri","ram","banglore");

        Map<Integer, List<String>> groupedByLength = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);
    }
}
