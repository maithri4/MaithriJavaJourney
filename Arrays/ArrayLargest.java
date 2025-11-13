import java.util.Scanner;
class ArrayLargest
{
public static void main(String args[])
{
Scanner sd=new Scanner(System.in);
int arr[]=new int[10];
for(int i=0;i<arr.length;i++)
{
arr[i]=sd.nextInt();
}
int lar=arr[0];
for(int num:arr)
{
if(num>lar)
lar=num;
System.out.print(num+" ");
}
System.out.print("\n largest element in the array is:"+lar);
}
}