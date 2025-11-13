import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n;
System.out.println("INPUT:");
n=in.nextInt();
if(n%2==n)
{
System.out.println("Even\n");
System.out.println(n+" is Even\n");
}
else
{
System.out.println("Odd\n");
System.out.println(n+" is odd\n");
}
}
}
