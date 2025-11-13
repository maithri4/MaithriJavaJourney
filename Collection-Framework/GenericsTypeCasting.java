import java.util.*;
class GenericsTypeCasting
{
public static void main(String args[])
{
List list = new ArrayList();    
list.add("hello");    
String s = (String) list.get(0);//typecasting    
//After Generics, we don't need to typecast the object.  
List<String> list1 = new ArrayList<String>();    
list1.add("hello");   
list1.add("Java");   
String str = list1.get(1); 
System.out.println(str);  
}
}