import java.util.function.Function;

public class LaunchFunction
{
    public static void main(String[] args)
    {
        Function<Character, Integer> findAscii = c -> (int)c;
        Function<Integer, Character> findChar = new Function<>()
        {
            @Override
            public Character apply(Integer n) {
                return (char)n.intValue();
            }
        };

        System.out.println(findAscii.apply('@'));
        System.out.println(findChar.apply(65));
    }
}
