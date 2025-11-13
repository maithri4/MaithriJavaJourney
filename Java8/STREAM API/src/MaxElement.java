import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxElement
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(56,32,43,305,65,12);
        Optional<Integer> max = nums.stream().max(Comparator.naturalOrder());
        int min = nums.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(max.orElse(-1));
        System.out.println(min);
    }
}
