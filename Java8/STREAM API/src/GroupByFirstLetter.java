import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter
{
    public static void main(String[] args)
    {
        List<String> words = List.of("apple", "banana", "apricot", "ammai", "blueberry","race car");

        Map<Character, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println(grouped);
    }
}