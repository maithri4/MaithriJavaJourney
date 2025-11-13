import java.util.Scanner;
class DigitCount
{
public static void main(String args[])
{
int count=0;
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=1;i<s.length();i++)
{
if(s.charAt(i)=='0'||s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'|| s.charAt(i)=='4'||s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'||s.charAt(i)=='9')
count++;
}
if(count!=0)
System.out.println(count);
else
System.out.println(count);
}
}