import java.util.Scanner;
class Vowel
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter alphabet:");
char a=s.nextLine().charAt(0);
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
System.out.println("entered alphabet is vowel");
}
else
{
System.out.println("consonant");
}
}
}