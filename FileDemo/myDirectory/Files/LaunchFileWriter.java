package Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LaunchFileWriter
{
    public static void main(String[] args)
    {
        File file=new File("M:\\myFile.txt");
        try
        {
            FileWriter fw=new FileWriter(file);
            if(file.canWrite())
            {
                fw.write("Hello,welcome to java files");
                System.out.println("Successfully wrote to the file.!");
            }
            else
            {
                System.out.println("Cannot write into this file.!");
            }
            fw.close();
        }
        catch (IOException e)
        {
            System.out.println("An Error Occured!");
            e.printStackTrace();
        }


    }
}
