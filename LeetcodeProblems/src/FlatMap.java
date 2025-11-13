import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args)
    {
        List<List<Integer>> nestedList = List.of(List.of(10, 20), List.of(305, 89), List.of(143));
        System.out.println(nestedList);

        Function<List<Integer>, Stream<Integer>> function = new Function<>() {
            @Override
            public Stream<Integer> apply(List<Integer> nums) {
                return nums.stream();
            }
        };

        Function<List<Integer>, Stream<Integer>> function2 = list -> list.stream();

        List<Integer> nums = nestedList.stream()
                .flatMap(List::stream) // list -> list.stream, function, Collection::stream
                .toList();
        System.out.println(nums);
    }
}
