import java.util.Scanner;
class EvenOdd
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("INPUT:");
int num=in.nextInt();
if((num/2)*2==num)
{
System.out.println("OUTPUT:");
System.out.println("EVEN");
}
else
{
System.out.println("OUTPUT:");
System.out.println("ODD");
}
}
}
