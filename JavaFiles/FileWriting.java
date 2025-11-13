import java.io.*;
class FileWriting
{
public static void main(String args[])throws IOException
{
File f=new File("M:\\Myfile.txt");
FileWriter fw=new FileWriter(f);
fw.write("Welcome to Java Files");
fw.close();
System.out.println("Succesfully executed");
}
}