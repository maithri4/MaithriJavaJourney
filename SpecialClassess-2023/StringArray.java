import java.util.Scanner;
class StringArray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter array size:");
int n=s.nextInt();
String arr[]=new String[n];
System.out.println("enter elements of array:");
for(int i=0;i<arr.length;i++)
{
arr[i]=s.next();
}
System.out.println("printing the elements in array:");
for(String a:arr)
{
System.out.println(a);
}
}
}