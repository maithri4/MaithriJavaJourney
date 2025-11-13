// Import the HashMap class
import java.util.HashMap;
public class HashMapCollection 
{
  public static void main(String[] args)
 {
 HashMap<String, String> hm = new HashMap<String, String>();
hm.put("England", "London");
hm.put("Germany", "Berlin");
hm.put("Norway", "Oslo");
hm.put("USA", "Washington DC");
System.out.println(hm);
System.out.println(hm.get("USA"));
int hm1=hm.size();
System.out.println(hm1);
System.out.println(hm.get("England"));
System.out.println(hm);
hm.clear();
System.out.println(hm);
  }
}