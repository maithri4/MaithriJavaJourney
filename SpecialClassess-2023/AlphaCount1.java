import java.util.Scanner;
class AlphaCount1
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a String:");
String s=sc.next();
for(int i=0;i<s.length();i++)
{
if((s.charAt(i))!=' ')
count++;
}
System.out.println("number of alphabets in a given string are:"+count);
}
}