package IntStreams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatTwoArrays {
    public static void main(String[] args)
    {
        int[] nums1 = {32,43,123,375,432};
        int nums2[] = {89,32,13,43,234};

       int[] res = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
                .toArray();
        System.out.println(Arrays.toString(res));

    }
}
