import java.util.Scanner;
class WithArgWithRetValue
{
public int display(int a,int b)
{
int res=a-b;
return res;
}
public static void main(String args[])
{
WithArgNoRetValue m=new WithArgNoRetValue();
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int z=s.nextInt();
m.display(x,z);
}
}