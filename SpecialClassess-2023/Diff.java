import java.util.Scanner;
class Diff
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("INPUT:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=Math.abs(a-b);
System.out.println("OUTUT:");
System.out.println(c);
}
}