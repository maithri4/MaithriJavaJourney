import java.util.List;

public class FlatMap
{
    public static void main(String[] args)
    {
        List<List<String>> names = List.of(List.of("one","two"), List.of("three","four"));
        System.out.println(names);

        List<String> flatList = names.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(flatList);
    }
}
