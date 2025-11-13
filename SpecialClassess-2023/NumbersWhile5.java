import java.util.Scanner;
class NumbersWhile5
{
public static void main(String args[])
{
int sum=0;
int i=0;
while(i<=100)
{
System.out.print(i+"+");
sum+=i;
i=i+5;
}
System.out.print("\b"+"="+sum);
}
}
