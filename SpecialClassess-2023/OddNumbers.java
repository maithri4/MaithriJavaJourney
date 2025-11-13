import java.util.Scanner;
public class OddNumbers  
{  
public static void main(String args[])   
{  
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int num=s.nextInt();
System.out.print("List of odd numbers from 1 to "+num+": ");  
System.out.println("   ");
for (int i=1; i<=num; i++)   
{   
if (i%2!=0)   
{  
System.out.print(i+"  ");  
}  
}  
}  
}  