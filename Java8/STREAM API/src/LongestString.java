import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class LongestString
{
    public static void main(String[] args)
     {

        List<String> words = List.of("java", "stream", "programming", "API");
        String longest =
                words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("none");

        System.out.println(longest);
    }
}