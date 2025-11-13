import java.util.Scanner;
import java.util.*;
class ArrayListDuplicates
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
ArrayList l=new ArrayList();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
if(!(l.contains(a)))
{
l.add(a);
}
System.out.println(l);
}
}
