import java.util.*;
class ListCollection
{
public static void main(String args[])
{
LinkedList<Integer> l=new LinkedList<Integer>();
l.add(30);
l.add(40);
l.add(20);
System.out.println(l);
int index=l.indexOf(40);
System.out.println(index);
int value=l.get(2);
System.out.println(value);
}
}