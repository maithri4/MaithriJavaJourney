import java.io.*;
class BufferedReader2
{
public static void main(String args[])throws Exception
{
InputStreamReader i=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(i);
System.out.println("enter age:");
int age=br.nextInt();
System.out.println("WELCOME:"+age);
}
}