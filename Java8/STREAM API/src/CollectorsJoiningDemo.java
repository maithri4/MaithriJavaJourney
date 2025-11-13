import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsJoiningDemo
{
    public static void main(String[] args)
    {
        List<String> nums = Arrays.asList("mai", "3", " ", "jicky");
        String name = nums.stream()
                .collect(Collectors.joining("","[", "]"));
        System.out.println(name);
    }
}
