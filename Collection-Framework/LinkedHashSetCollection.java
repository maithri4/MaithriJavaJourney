import java.util.*;  
public class LinkedHashSetCollection
{  
public static void main(String args[])
{  
LinkedHashSet set=new LinkedHashSet();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
set.add(44);  
set.add(null);  
set.add(null);  
Iterator itr=set.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  