import java.util.Scanner;
public class VowelsRemoval
{
public static void main(String args[])
{
String up_str="";
Scanner sd=new Scanner(System.in);
String s=sd.nextLine();
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
continue;
else
up_str=up_str+s.charAt(i);
}
System.out.println("Original String is: "+s);
System.out.println("String without vowels is: "+up_str);
}
}
