package Files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LaunchFileReader
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("M:\\myFile.txt");
        FileReader fr=new FileReader(file);
        int i;
        if(file.exists() && file.canWrite())
        {
            while((i= fr.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
        else
            System.out.println("File Cannot exist or failed to write into this file");
    }
}
