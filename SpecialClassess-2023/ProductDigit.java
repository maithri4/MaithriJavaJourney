import java.util.Scanner;
class ProductDigit
{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
int n=c.nextInt();
int pro=1;
while(n>0)
{
int rem=n%10;
pro=pro*(rem);
n=n/10;
}
System.out.println(pro);
}
}
