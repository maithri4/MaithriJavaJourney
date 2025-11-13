import java.util.Scanner;
class Digits
{
public static void main(String args[])
{
int count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter a string:");
String str=s.nextLine();
for(int i=0;i<=str.length()-1;i++)
{
if(str.charAt(i)==0||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9')
{
count++;
}
}
System.out.println("number  of digits in a given string:"+count);
}
}