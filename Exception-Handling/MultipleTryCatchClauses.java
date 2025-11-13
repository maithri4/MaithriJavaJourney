import java.util.Scanner;
class MultipleTryCatchClauses
{
public static void main(String maithri[])
{
Scanner mai=new Scanner(System.in);
System.out.println("enter the value of a:");
int a=mai.nextInt();
System.out.println("enter the value of b:");
int b=mai.nextInt();
System.out.println("enter a String:");
String str=mai.next();
System.out.println("enter index of which the character is to be checked:");
int index=mai.nextInt();
try
{
int c=a/b;
System.out.println(a+"/"+b+"="+c);
try
{
System.out.println("character at "+index+" is:"+str.charAt(index));
}     // inner try close
catch(StringIndexOutOfBoundsException s)
{
System.out.println(s);
}    //inner catch close
}   // outer try close
catch(ArithmeticException ae)
{
System.out.println(ae);
}
}
}


