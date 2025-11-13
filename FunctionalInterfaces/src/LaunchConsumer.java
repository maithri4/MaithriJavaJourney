import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LaunchConsumer
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(305, 44, 89, 143);

        Consumer<Integer> consumer = new Consumer<>() // n->sop(n);
        {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        nums.forEach(consumer);
    }
}
