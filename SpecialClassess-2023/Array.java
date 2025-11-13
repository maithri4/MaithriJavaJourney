import java.util.Scanner;
class StringArray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter array elements:");
String arr[]=s.next();
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);
}
}