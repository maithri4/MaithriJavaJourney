import java.util.ArrayList;
import java.util.List;

public class GenerateSubStrings
{
    public static void generateSubStrings(String str)
    {
        List<String> result = new ArrayList<>();
        int n = str.length();
        for(int i=0;i<n;i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<n;j++)
                sb.append(str.charAt(j));

            result.add(sb.toString());
        }
        System.out.println(result);
    }
    public static void main(String[] args)
    {
        String s = "aeiouu";
        generateSubStrings(s);
    }
}
