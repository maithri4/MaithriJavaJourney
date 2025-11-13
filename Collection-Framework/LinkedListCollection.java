import java.util.*;
class LinkedListCollection
{
public static void main(String args[])
{
LinkedList a=new LinkedList();
a.add("Jyothish");
a.add("maithri");
a.add("maithri");
a.add(null);
a.add(44);
System.out.println(a);
a.add(1,"Apple");
System.out.println(a);
a.remove(3);
System.out.println(a);
a.addLast("ktm");
System.out.println(a);
a.removeLast();
a.addFirst(48);
System.out.println(a);
}
}