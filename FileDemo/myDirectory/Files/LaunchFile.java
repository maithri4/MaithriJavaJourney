package Files;
import java.io.File;
import java.io.IOException;

public class LaunchFile
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("M:\\myFile.txt");
        if(file.createNewFile())
            System.out.println("File is created: "+file.getName());
        else
            System.out.println("File already exists: "+file.getName());
    }
}
