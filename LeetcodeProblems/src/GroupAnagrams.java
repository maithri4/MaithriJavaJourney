import java.util.*;
import java.util.Map;

public class GroupAnagrams
{
    public static List<List<String>> groupAnagrams(String[] words)
    {
        Map<String, List<String>> map = new HashMap<>();
        for(String s:words)
        {
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            //map.computeIfAbsent(key, k->new ArrayList<>()).add(s);
            if(map.containsKey(key))
                map.get(key).add(s);
            else
            {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args)
    {
        String arr[] = {"triangle", "eat", "earth", "heart", "listen","silent","integral"};
        System.out.println(groupAnagrams(arr));
    }
}
