import java.util.*;
class TreeSetCollection
{
public static void main(String args[])
{
TreeSet t=new TreeSet();
t.add(1);
t.add(1);
t.add(44);
t.add(88);
t.add(8);
t.add(1);
t.add(12);
t.add(18);
t.add(24);
System.out.println(t);
t.remove(12);
System.out.println(t);
SortedSet s1=t.headSet(44);
System.out.println(s1);
SortedSet s2=t.tailSet(1);
System.out.println(s2);
SortedSet s3=t.subSet(1,44);
System.out.println(s3);
}
}