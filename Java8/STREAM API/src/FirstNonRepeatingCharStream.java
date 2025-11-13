import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharStream {
    public static void main(String[] args)
    {
        String s = "swiss";

        char firstNonRepChar =  s.chars()
                    .mapToObj(n->(char)n)
                    .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue()==1)
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElseThrow();


        System.out.println(firstNonRepChar);
    }
}
