import java.io.*;
class FileHandlingMethods
{
public static void main(String args[])
{
File f=new File("M:\\Myfile.txt");
if(f.exists())
{
System.out.println("File name is:"+f.getName());
System.out.println("File length is:"+f.length());
System.out.println("File location is:"+f.getAbsolutePath());
System.out.println("File LastModified:"+f.lastModified());
System.out.println("File is readable:"+f.canRead());
System.out.println("File is writable:"+f.canWrite());
}
else
{
System.out.println("File data is not found:");
}
}
}