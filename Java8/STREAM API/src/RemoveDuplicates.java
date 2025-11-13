import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(10,23,64,12,10,12);
        List<Integer> uniqueNums = nums.stream().distinct().toList();
        System.out.println(uniqueNums);
    }
}
