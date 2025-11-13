package IntStreams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class SummaryStatisticsExample {
    public static void main(String[] args)
    {
        int[] numbers = {32,43,123,375,432};

        IntSummaryStatistics stats = Arrays.stream(numbers).summaryStatistics();

        System.out.println("Total elements present: "+stats.getCount());
        System.out.println("Minimum Value: "+stats.getMin());
        System.out.println("Maximum value: "+stats.getMax());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Sum of elements: "+stats.getSum());
    }
}
