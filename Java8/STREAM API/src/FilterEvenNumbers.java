import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterEvenNumbers
{
    public static void main(String[] args)
    {
        Predicate<Integer> pred = n -> n%2==0;
        List<Integer> nums1 = Arrays.asList(10,4,1,9,6,5,8);
        List<Integer> nums2 = nums1.stream().filter(pred).toList();
        System.out.println(nums2);
    }
}
