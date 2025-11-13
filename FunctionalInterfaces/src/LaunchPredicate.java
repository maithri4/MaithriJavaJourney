import java.util.function.Predicate;

public class LaunchPredicate
{
    public static void main(String[] args)
    {
        Predicate<Integer> predicate = new Predicate<>()  // n -> (n&1)==0
        {
            @Override
            public boolean test(Integer n) {
                return (n&1)==0;
            }
        };

        System.out.println(predicate.test(44));
    }
}
