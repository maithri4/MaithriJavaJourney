import java.io.*;
class BufferedReader1
{
public static void main(String args[])throws Exception
{
InputStreamReader i=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(i);
System.out.println("enter name:");
String name=br.readLine();
System.out.println("WELCOME:"+name);
}
}