import java.util.Arrays;
import java.util.List;

public class LaunchStream3
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(2,5,1,6,8,12,9);
        int first =
                nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .skip(2)
                        .findFirst()
                        .get();

        System.out.println(first);
    }
}
