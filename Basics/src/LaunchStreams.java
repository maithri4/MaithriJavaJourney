import java.util.*;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LaunchStreams
{
    public static void main(String[] args)
    {
        int nums[] = {305,44,144,89,45};
//        int max = Arrays.stream(nums).max().orElse(-1);
//        System.out.println(max);
//        int min = Arrays.stream(nums).min().orElse(-1);
//        System.out.println(min);
//        int sum = Arrays.stream(nums).sum();
//        System.out.println("sum of elements in the array is: "+sum);
//        OptionalInt first = Arrays.stream(nums).findFirst();
//        System.out.println(first.orElse(-1));
//        int evenNums[] = Arrays.stream(nums).filter(n->n%2==0).toArray();
//        System.out.println("Even Numbers: "+Arrays.toString(evenNums));
//        int[] sortedNums = Arrays.stream(nums).sorted().toArray();
//        System.out.println(Arrays.toString(sortedNums));
//        String[] words = {"apple", "jyothish","venky","ram"};
//        String s = Arrays.stream(words).collect(Collectors.joining(", ","[","]"));
//        System.out.println(s);
//        List<Integer> oddDouble = Arrays.stream(nums).boxed().filter(n->n%2!=0).map(n->n*2).toList();
//        System.out.println(oddDouble);
//        int[] uniqueNums = Arrays.stream(nums).distinct().toArray();
//        System.out.println(Arrays.toString(uniqueNums));
//        int size = (int) Arrays.stream(nums).count();
//        System.out.println(size);
//        int findAny = Arrays.stream(nums).findAny().orElse(-1);
//        System.out.println(findAny);
//        int[] nums2 = Arrays.stream(nums).skip(2).toArray();
//        System.out.println(Arrays.toString(nums2));

          List<String> names = Arrays.asList("apple", "jyo","venky","ram");
//          names.forEach(System.out::println);
        ListIterator<String> litr = names.listIterator(names.size());
        while (litr.hasPrevious())
            System.out.println(litr.previous());
        System.out.println("-----------------------------");
        while (litr.hasNext())
            System.out.println(litr.next());
    }
}
