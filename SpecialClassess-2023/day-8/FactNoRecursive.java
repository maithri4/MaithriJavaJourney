import java.util.Scanner;
class FactNoRecursive
{
public int calculateFact(int n)
{
long res=1;
if(n==0)
{
return 1;
}
else
{
for(int i=1;i<=n;i++)
{
res=res*i;
}
}
}
public static void main(String jyo[])
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
FactNoRecursive f=new FactNoRecursive();
System.out.println(f.calculateFact(p));
}
}
