import java.util.Scanner;
class Vowels
{
public static void main(String args[])
{
int count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter a string:");
String str=s.nextLine();
str=str.toLowerCase();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
count++;
}
}
System.out.println("number  of vowels in a given string:"+count);
}
}