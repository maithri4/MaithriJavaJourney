class Maithri
{  
  void mai()
{
System.out.println("Good Morning");
}  
}  
class Apple extends Maithri
{  
  void mai()
{
System.out.println("Hello Mai");
}  
}
class MethodOverriding
{
  public static void main(String args[])
{  
 Apple  a= new Apple();
 a.mai();
  }  
}  