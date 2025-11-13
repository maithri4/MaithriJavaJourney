import java.util.*;
public class EvenNumbers
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(4,44,89,68,1,45,24);

        List<Integer> evenNums =
                                    nums.stream()
                                    .filter(n->n%2==0)
                                    .toList();

        System.out.println(evenNums);
        int sum = nums.stream().min(Comparator.naturalOrder()).orElse(-1);
        System.out.println(sum);
    }
}
