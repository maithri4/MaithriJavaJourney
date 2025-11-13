package Files;
import java.io.*;
public class LaunchDirectory
{
    public static void main(String[] args)
    {
        File dir = new File("myDirectory");
        if (dir.mkdir())
            System.out.println("Directory created successfully.");
        else
            System.out.println("Failed to create directory.");
    }
}
