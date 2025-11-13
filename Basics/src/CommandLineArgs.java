import java.util.Arrays;

public class CommandLineArgs
{
    public static void main(String[] args)
    {
//        String[] arr = args;
//        arr[0] = "Maithri waste.!";
        int n = args.length;
        if(n > 0)
        {
            System.out.println("Arguments provided are: ");
            for(String s : args)
                System.out.println(s);
        }
        else
            System.out.println("No Arguments are provided..!");
        System.out.println("Length of array is: "+n);
//       System.out.println(Arrays.toString(arr));
    }
}