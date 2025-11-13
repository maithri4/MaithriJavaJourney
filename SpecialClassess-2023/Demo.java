import java.util.Scanner;
class Demo
{
static void add(int a,int b)
{
System.out.println("sum of a&b:"+(a+b));
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter the value of a:");
int a=in.nextInt();
System.out.println("enter the value of b:");
int b=in.nextInt();
add(a,b);
}
}