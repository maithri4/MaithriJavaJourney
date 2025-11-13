import java.util.*;
class HashSetCollection
{
public static void main(String args[])
{
HashSet h=new HashSet();
h.add("mai");
h.add(null);
h.add("mai");
h.add(44);
System.out.println(h);
h.add("java");
System.out.println(h);
}
}