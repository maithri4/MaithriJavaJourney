import java.io.IOException;

public class ShutdownPc
{
    public static void main(String[] args)
    {
        try
        {
            Runtime.getRuntime().exec("shutdown /s /t 10");
            System.out.println("Shutdown initiated....!");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
