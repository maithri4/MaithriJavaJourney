package Files;

import java.io.File;
public class FileHandlingMethods
{
    public static void main(String[] args)
    {
        File file=new File("M:\\myFile.txt");
        if(file.exists())
        {
            System.out.println("File Name:"+file.getName());
            System.out.println("Length of the file:"+file.length());
            System.out.println("Absolute Path:"+file.getAbsolutePath());
            System.out.println("Last Modified:"+file.lastModified());
            System.out.println("File can be readed:"+file.canRead());
            System.out.println("Can write into "+file.getName()+":"+file.canWrite());
        }
    }
}
