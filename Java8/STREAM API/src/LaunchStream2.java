import java.util.*;
import java.util.stream.Collectors;

public class LaunchStream2
{
    public static void main(String[] args)
    {
        List<List<String>> list = Arrays.asList(Arrays.asList("Ram", "Jyo","Jyo"), Arrays.asList("mom", "dad"));

        List<String> names = list.stream()
                .flatMap(Collection::stream)
                .distinct()
                .toList();
        names.forEach(System.out::println);

        //Collections.sort(names,Comparator.reverseOrder());



//        list.forEach(names -> names.forEach(System.out::println));
    }
}
