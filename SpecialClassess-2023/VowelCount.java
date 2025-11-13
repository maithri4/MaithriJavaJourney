import java.util.Scanner;
class VowelCount
{
public static void main(String args[])
{
int count=0;
Scanner in=new Scanner(System.in);
String s=in.nextLine();
s=s.toLowerCase();
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
{
count++;
}
}
System.out.println(count);
}
}