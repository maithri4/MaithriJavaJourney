import java.io.*;
class FileReading
{
public static void main(String args[])throws IOException
{
File f=new File("M:\\Myfile.txt");
FileReader fr=new FileReader(f);
int i;
//i=fr.read();
//System.out.println(i);
while((i=fr.read())!=-1)
{
System.out.print((char)i+"");
}
fr.close();
}
}