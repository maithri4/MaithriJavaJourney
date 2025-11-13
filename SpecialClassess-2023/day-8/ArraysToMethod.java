import java.util.Scanner;
class ArraysToMethod
{
public int max(int[] array)
{
int max=0;
for(int i=0;i<array.length;i++)
{
if(array[i]>max)
{
max=array[i];
}
}
return max;
}
public int min(int[] array)
{
int min=array[0];
for(int i=0;i<array.length;i++)
{
if(array[i]<min)
{
min=array[i];
}
}
return min;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of an array that to be created:");
int size=s.nextInt();
int[] myArray=new int[size];
System.out.println("Enter the elements of an array:");
for(int i=0;i<size;i++)
{
myArray[i]=s.nextInt();
}
ArraysToMethod m=new ArraysToMethod();
System.out.println("maximum value in array is:"+m.max(myArray));
System.out.println("minimum value in array is:"+m.min(myArray));
}
}