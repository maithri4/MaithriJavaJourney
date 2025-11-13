import java.io.*;
class FileCreating
{
public static void main(String args[])
{
File f=new File("M:\\Myfile.txt");
try
{
if(f.createNewFile())
{
System.out.println("File is created");
}
else
{
System.out.println("File is already exist");
}
}
catch(IOException e)
{
System.out.println("File is not created");
}
}
}