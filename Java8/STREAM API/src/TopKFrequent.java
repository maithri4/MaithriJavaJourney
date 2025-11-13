
import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k)
    {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums)
            freqMap.merge(num, 1, Integer::sum);

        int[] res = freqMap.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();

        return res;
    }

    public static void main(String[] args)
    {
        TopKFrequent sol = new TopKFrequent();
        int[] nums = {1, 1, 1, 2, 2, 3,5,5,1,9,2,4};
        int k = 2;
        int[] result = sol.topKFrequent(nums, k);

        System.out.println(Arrays.toString(result));
    }
}

