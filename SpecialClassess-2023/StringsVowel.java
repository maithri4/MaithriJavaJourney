import java.util.Scanner;
class VowelConsCount
{
public static void main(String args[])
{
int Maithri_Love=0,count=0;
Scanner s=new Scanner(System.in);
System.out.println("enter a string:");
String str=s.next();
str=str.toLowerCase();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
Maithri_Love++;
}
else if(str.charAt(i)>='a')
{
count++;
}
}
System.out.println("number  of vowels in a given string:"+Maithri_Love);
System.out.println("number  of Consoants in a given string:"+count);
}
}