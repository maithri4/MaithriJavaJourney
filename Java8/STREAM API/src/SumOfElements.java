import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class SumOfElements
{
    public static void main(String[] args)
    {
        BinaryOperator<Integer> binOp = Integer::sum;
        List<Integer> nums = Arrays.asList(10,20,45,50);

        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        int sum2 = nums.stream().reduce(0,binOp);
        System.out.println(sum);
        System.out.println(sum2);
    }
}
