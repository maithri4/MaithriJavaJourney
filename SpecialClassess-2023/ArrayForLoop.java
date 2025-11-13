
import java.util.Scanner;
class ArrayForLoop
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[5];
a[0]=1;
a[1]=5;
a[2]=10;
a[3]=23;
a[4]=14;
System.out.println("Accessing elements of array:");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}