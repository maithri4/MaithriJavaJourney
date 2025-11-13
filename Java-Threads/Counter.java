public class Counter 
{
public static void main(String[] args)throws InterruptedException
{
 int n=5;
  while(n>0)
  {
    System.out.println(n);
    Thread.sleep(1000);
    n-=1;
  }  
  System.out.println("Go...!!"); 
}
}
