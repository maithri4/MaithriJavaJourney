import java.util.Scanner;
class V
{
public static void main(String args[])
{
int count=0;
Scanner sd=new Scanner(System.in);
String s=sd.nextLine();
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)!=' ')
{
count++;
}
}
System.out.println("number of characters in a given String are:"+count);
}
}