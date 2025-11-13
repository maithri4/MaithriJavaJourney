import java.util.Scanner;
class SimpleIntrest
{
public static void main(String args[])
{
Scanner v=new Scanner(System.in);
int p=v.nextInt();
double r=v.nextDouble();
double t=v.nextDouble();
double si=p*r*t/100;
System.out.println(si);
}
}