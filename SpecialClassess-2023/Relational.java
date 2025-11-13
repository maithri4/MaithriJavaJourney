import java.util.Scanner;
class Relational
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter first number:");
int  num1=s.nextInt();
 System.out.println("enter second number:");
int  num2=s.nextInt();
System.out.println("num1>num2 is "+(num1>num2));
System.out.println("num1<num2 is "+(num1<num2));
System.out.println("num1>=num2 is "+(num1>=num2));
System.out.println("num1<=num2 is "+(num1<=num2));
System.out.println("num1==num2 is "+(num1==num2));
System.out.println("num1!=num2 is 
"+(num1!=num2));
}
}