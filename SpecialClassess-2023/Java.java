import java.util.Scanner;
class Java
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the value of a:");
int i=s.nextInt();
System.out.println("enter the value of j:");
int j=s.nextInt();
if(j==0)
System.out.println("error by dividing i with j:");
else
System.out.println(i+" divide by "+j+" is:"+(i/j));
i=i+j;
}
}