import java.io.*;
class FileDeleting
{
public static void main(String args[])
{
File f=new File("M:\\Myfile.txt");
if(f.delete())
{
System.out.println(f.getName()+" is deleted:");
}
else
{
System.out.println("failed");
}
}
}