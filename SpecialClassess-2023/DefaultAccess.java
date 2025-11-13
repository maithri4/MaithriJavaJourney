package pack;  
class DefaultAccess
{  
  void msg()
{
System.out.println("Hello");
}  
}  

package mypack;  
import pack.*;  
class TestDefaultAccess
{  
  public static void main(String args[])
{  
   A obj = new A();//Compile Time Error  
   obj.msg();//Compile Time Error  
  }  
}  