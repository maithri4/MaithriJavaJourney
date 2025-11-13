import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreams
{
    public static void main(String[] args) {
        int nums[] = {3,9,54,2,8,9,143};
       int max = Arrays.stream(nums).max().orElse(-1);
       var sum = Arrays.stream(nums).sum();
        System.out.println(max);
        System.out.println(sum);
        int[] stream = Arrays.stream(nums)
                .sorted()
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(stream));
    }
}
