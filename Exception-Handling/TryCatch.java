class TryCatch
{
public static void main(String args[])
{
System.out.println("Maithri");
System.out.println("Apple");
System.out.println("Jessi");
try
{
System.out.println(4/0);         // ArithmeticException occurs 
}        
catch(ArithmeticException ae)
{
System.out.println(ae);
}                                                               // below code will execute                                      
System.out.println("Java");
System.out.println("Python");
System.out.println("DBMS");
}
}