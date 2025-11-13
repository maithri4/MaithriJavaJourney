import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortInDescendingOrder
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(10,4,54,100,43);
        List<Integer> descendingOrder = nums.stream().sorted((Comparator.reverseOrder())).toList();
        System.out.println(descendingOrder);
    }
}
