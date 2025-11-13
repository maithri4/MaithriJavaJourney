
import java.util.Scanner;
class ArraySum
{
public static void main(String args[])
{
int sum=0;
Scanner s=new Scanner(System.in);
int a[]={12,4,5,2,5};
for(int arr:a)
{
sum+=arr;
}
int arrlen=a.length;
double avg=((double)sum/ (double)arrlen);
System.out.println("sum="+sum);
System.out.println("Average="+avg);
}
}