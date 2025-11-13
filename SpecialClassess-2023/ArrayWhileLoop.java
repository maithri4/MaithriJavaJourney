
import java.util.Scanner;
class ArrayWhileLoop
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]={12,4,5,2,5};
System.out.println("Accessing elements of array:");
int i=0;
while(i<a.length)
{
System.out.println(a[i]);
i++;
}
}
}