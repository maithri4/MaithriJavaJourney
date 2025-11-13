import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagramStream {
    public static void main(String[] args)
    {
        String words[] = {"triangle", "eat", "earth", "heart", "listen","silent","integral"};

        List<List<String>> grouped = Arrays.stream(words)
                .collect(Collectors.groupingBy(word ->{
                    char[] chars = word.toCharArray();
                    Arrays.sort(chars);
                    return new String(chars);
                }))
                .values()
                .stream()
                .toList();
        System.out.println(grouped);
    }
}
