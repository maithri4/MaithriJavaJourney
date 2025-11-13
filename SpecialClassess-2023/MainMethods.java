import java.io.*;
import java.util.Scanner;
class MainMethods
{
public static void main()
{
System.out.println("No Arguments");
}
public static void main(int a)
{
System.out.println("Value of a=:"+a);
}
public static void main(String name)
{
System.out.println("Name="+name);
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String str=s.next();
main();
main(n);
main(str);
}
}
