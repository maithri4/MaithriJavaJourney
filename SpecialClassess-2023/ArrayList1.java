import java.util.*;
class ArrayList1
{
public static void main(String args[])
{
ArrayList a=new ArrayList();
a.add("mai");
a.add("mai");
a.add("java");
a.add(44);
System.out.println(a);
HashSet h=new HashSet(a);
System.out.println(h);
}
}