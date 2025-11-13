import java.util.Scanner;
class SpecialCharCount
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=1;i<s.length();i++)
{
if(!Character.isDigit(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)) && !Character.isLetter(s.charAt(i)) )
count++;
}
if(count==0)
System.out.println("there are no special characters in "+count);
else
System.out.println("number of special characters in "+s+" are:"+count);
}
}