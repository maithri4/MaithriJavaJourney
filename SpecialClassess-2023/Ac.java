class Ac{  
//private constructor  
 Ac()
{
System.out.println("private constructor");
}
public static void msg(int a)
{
System.out.println("Hello java"+a);
}  
 public static void main(String args[])
{  
   Ac obj=new Ac();//Compile Time Error 
msg(20);
 }  
}  