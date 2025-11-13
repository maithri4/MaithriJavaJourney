import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountFrequency
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        sc.close();
        Map<Character,Long> freqMap =
                        s1.chars()
                        .mapToObj(c-> (char)c)
                        .collect(Collectors.groupingBy(c->c, Collectors.counting()));
        

         freqMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character,Long> comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
