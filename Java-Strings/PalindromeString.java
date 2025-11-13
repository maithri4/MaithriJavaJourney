import java.util.Scanner;
class PalindromeString
{
public static void main(String args[])
{
String reverse="";
Scanner c=new Scanner(System.in);
String s=c.nextLine();
int len=s.length()-1;
for(int i=len;i>=0;i--)
{
reverse=reverse+s.charAt(i);
}
if(s.equals(reverse))
System.out.println("YES");
else
System.out.println("NO");
}
}
