import java.util.Scanner;
class NoOfChars
{
public static void main(String args[])
{
int count=0;
Scanner c=new Scanner(System.in);
String s=c.nextLine();
for(int i=0;i<s.length();i++)
{
count++;
}
System.out.println(count);
}
}
