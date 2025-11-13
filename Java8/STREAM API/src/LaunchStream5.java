import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LaunchStream5
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,203,53,6,30,4);
        int max =
                list.stream()
                        .max(Comparator.naturalOrder()).orElse(-1);
        int min =
                list.stream()
                        .min(Comparator.naturalOrder()).orElse(-1);

        System.out.println(max);
        System.out.println(min);
    }
}
