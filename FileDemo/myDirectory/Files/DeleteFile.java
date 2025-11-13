package Files;

import java.io.File;

public class DeleteFile
{
    public static void main(String[] args)
    {
        File file=new File("M:\\myFile.txt");
        if(file.delete())
            System.out.println(file.getName()+" is deleted..!");
        else
            System.out.println("failed to delete the file");
    }
}
