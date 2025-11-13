import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("apple", "orange", "grape", "banana", "apple", "orange", "apple");
       Map<String, Long> freqMap =
                            names.stream()
                         .collect(Collectors.groupingBy(
                                 Function.identity(),
                                 Collectors.counting()
                         ));
        System.out.println(freqMap);

       Optional<Map.Entry<String, Long>> first = freqMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long> comparingByValue().reversed())
                .skip(1)
                .findFirst();

        System.out.println(first);

    }
}
