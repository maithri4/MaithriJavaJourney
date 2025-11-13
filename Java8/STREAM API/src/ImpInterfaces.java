import java.util.LinkedHashMap;
import java.util.function.*;

public class ImpInterfaces
{
    public static void main(String[] args)
    {
        Function<Character, Integer> function = character -> (int)character;
        System.out.println(function.apply('A'));

        Predicate<Integer> predicate = num->(num&1)==0;
        System.out.println(predicate.test(4));

        Consumer<Integer> consumer = System.out::println;
        consumer.accept(305);

        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println(binaryOperator.apply(10,20));

        IntPredicate intPredicate = n->n%2==0;
        System.out.println(intPredicate.test(89));

        IntConsumer intConsumer = System.out::println;
        intConsumer.accept(34);

        Supplier<LinkedHashMap<Character, Long>> supplier = LinkedHashMap::new;
        System.out.println(supplier.get());
    }
}
