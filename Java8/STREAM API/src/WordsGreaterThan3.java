import java.util.Arrays;
import java.util.List;

public class WordsGreaterThan3
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("apple","mai","venky","balu","rama chandra","rukmini");
        List<String> res = words.stream().filter(word -> word.length()>3).toList();
        System.out.println(res);
    }
}
