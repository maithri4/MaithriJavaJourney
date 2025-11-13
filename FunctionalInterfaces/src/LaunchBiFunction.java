import java.util.function.BiFunction;

public class LaunchBiFunction
{
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = new BiFunction<>() // Integer::sum
        {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };

        System.out.println(biFunction.apply(10, 20));
    }
}
