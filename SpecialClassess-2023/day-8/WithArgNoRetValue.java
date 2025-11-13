import java.util.Scanner;
class WithArgNoRetValue
{
public void display(int a,int b)
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}
public static void main(String args[])
{
WithArgNoRetValue m=new WithArgNoRetValue();
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
m.display(n1,n2);
}
}