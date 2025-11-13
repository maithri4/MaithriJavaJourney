import java.util.*;
class Generics
{
public static void main(String args[])
{
ArrayList<String> a=new ArrayList<String>();
a.add("Java");
a.add("Generics");
//a.add(10);  //CT Error
//a.add('A');  //CT Error
System.out.println(a);
}
}