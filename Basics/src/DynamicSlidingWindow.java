import java.util.*;

public class DynamicSlidingWindow
{
    public static void main(String[] args)
    {
        String s = "hello";
        Set<Character> charSet = new HashSet<>();
        int maxLen = 0, left = 0;
        for(int right=0; right<s.length(); right++)
        {
            while(charSet.contains(s.charAt(right)))
            {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));

            maxLen = Math.max(maxLen, right-left+1);
        }
        System.out.println(maxLen);
    }
}
