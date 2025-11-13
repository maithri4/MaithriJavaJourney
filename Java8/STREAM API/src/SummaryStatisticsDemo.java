import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStatisticsDemo {
    public static void main(String[] args)
    {
        List<Integer> nums = List.of(589, 143, 305, 44, 58);

        IntSummaryStatistics stats = nums.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Total elements present: "+stats.getCount());
        System.out.println("Minimum Value: "+stats.getMin());
        System.out.println("Maximum value: "+stats.getMax());
        System.out.println("Average: "+stats.getAverage());
        System.out.println("Sum of elements: "+stats.getSum());

    }
}
