class A
{  
//private constructor  
 private A()
{
System.out.println("private constructor");
}
public static void msg(int a)
{
System.out.println("Hello java"+a);
}  
}  
public class PrivateConstructor
{
 public static void main(String args[])
{  
   A obj=new A();//Compile Time Error 

 }  
}  