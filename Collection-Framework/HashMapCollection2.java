// Import the HashMap class
import java.util.HashMap;
public class HashMapCollection2
{
  public static void main(String[] args)
 {
 HashMap hm = new HashMap();
hm.put(10, "London");
hm.put(20, "Berlin");
hm.put(30, "Oslo");
hm.put(40, "Washington DC");
System.out.println(hm);
System.out.println(hm.get(10));
int hm1=hm.size();
System.out.println(hm1);
System.out.println(hm.get(30));
System.out.println(hm);
hm.clear();
System.out.println(hm);
  }
}