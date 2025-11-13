import java.util.Scanner;
class Continue
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n=s.nextInt();
byte i=0;
while(true)
{
i++;
if(i%5==0)continue;
else
System.out.println(i+" ");
}
}
}
