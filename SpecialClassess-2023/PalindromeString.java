import java.util.Scanner;
class PalindromeString
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
String s=in.nextLine();
String temp=s;
String rs="";
int l=s.length()-1;
for(int i=l;i>=0;i--)
{
rs=rs+s.charAt(i);
}
if(temp.equals(rs))
System.out.println("YES");
else
System.out.println("NO");
}
}