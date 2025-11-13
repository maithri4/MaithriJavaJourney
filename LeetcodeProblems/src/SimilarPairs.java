import java.util.*;

class SimilarPairs
{
    public int similarPairs(String[] words)
    {
        int count = 0;
        for (int i = 0; i < words.length; i++)
        {
            for (int j = i + 1; j < words.length; j++)
                if (isSimilar(words[i], words[j]))
                    count++;
        }
        return count;
    }

    public boolean isSimilar(String s1, String s2)
    {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : s1.toCharArray())
            set1.add(c);

        for (char c : s2.toCharArray())
            set2.add(c);

        return  set1.equals(set2);
    }

    public static void main(String[] args)
    {
        String[] words = {"aba", "aabb", "abcd", "bac", "aabc"};
        System.out.println(new SimilarPairs().similarPairs(words));
    }
}
