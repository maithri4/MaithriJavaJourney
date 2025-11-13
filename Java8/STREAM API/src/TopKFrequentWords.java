import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k)
    {
        Map<String, Long> frequencyMap = Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return frequencyMap.entrySet()
                .stream()
                .sorted((a, b) ->
                {
                    int freqCompare = b.getValue().compareTo(a.getValue());
                    return freqCompare != 0 ? freqCompare : a.getKey().compareTo(b.getKey());
                })
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
    }

    public static void main(String[] args) {
        TopKFrequentWords sol = new TopKFrequentWords();
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.println(sol.topKFrequent(words, k));
    }
}
