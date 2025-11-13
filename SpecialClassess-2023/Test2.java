import java.util.Scanner;
class Test2
{
public static void main(String args[])
{
boolean cond=true;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
System.out.println("Cond is:"+cond);
System.out.println("Var1 is:"+a);
System.out.println("Var2 is:"+b);
//appyling not operator
System.out.println("Now Cond is:"+!cond);
System.out.println("!(a<b)="+!(a<b));
System.out.println("!(a>b)="+!(a>b));
}
}