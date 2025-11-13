import java.util.Scanner;
class VowelCount2
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=0;i<s.length();i++)
{
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
count++;
}
if(count!=0)
System.out.println(count);
else
System.out.println("No");
}
}