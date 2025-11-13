package pack;  
public class Protected
{  
protected void msg()
{
System.out.println("Hello");
}  
}  
package mypack;  
import pack.*;  
  
class TestProtected extends Protected
{  
  public static void main(String args[])
{  
  TestProtected obj = new TestProtected();  
   obj.msg();  
  }  
}  