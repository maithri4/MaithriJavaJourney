import java.util.Scanner;
class SumDigit
{
public static void main(String args[])
{
int sum=0,rem=0;
Scanner c=new Scanner(System.in);
int n=c.nextInt();
while(n>0)
{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println(sum);
}
}
