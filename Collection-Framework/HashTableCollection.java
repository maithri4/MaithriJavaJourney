import java.util.*;
class HashTableCollection
{
public static void main(String args[])
{
Hashtable h=new Hashtable();
h.put("mai",44);
h.put("Apple",45);
h.put("mai",44);
System.out.println(h);
h.put("java",88);
System.out.println(h);
Collection c=h.values();
System.out.println(c);
Set c1=h.keySet();
System.out.println(c1);
System.out.println(h.contains(54));
System.out.println(h.contains(44));
System.out.println(h.contains(88));
}
}