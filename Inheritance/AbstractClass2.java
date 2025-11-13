 abstract class Mai
{  
  Mai()
{
System.out.println("This is Constructor");
}  
   abstract void run();  //abstract method
   void disp()
{
System.out.println("Non-abstract method");}
  
 }  
 class Apple extends Mai
{  
 void run()
{
System.out.println("This is Apple's class");
}  
 }  
 class AbstractClass2
{  
 public static void main(String args[])
{  
Mai obj = new Apple();  
  obj.run();  
  obj.disp();  
 }  
}  