import java.util.Scanner;
class NumbersWhileInfinite
{
public static void main(String args[])
{
int i=1;
int sum=0;
while(i<=100)
{
sum+=i;
i=i+5;
}
System.out.print(sum);
}
}
