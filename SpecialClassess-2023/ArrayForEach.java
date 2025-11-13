
import java.util.Scanner;
class ArrayForEach
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]={12,4,5,2,5};
System.out.println("Accessing elements of array:");
for(int arr:a)
{
System.out.println(arr);
}
}
}