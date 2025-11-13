package Files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LaunchFileReader2
{
    public static void main(String[] args)throws FileNotFoundException
    {
        File file=new File("M:\\myFile.txt");
        Scanner sd=new Scanner(file);
        while(sd.hasNextLine())
        {
            System.out.print(sd.nextLine());
        }

    }
}
