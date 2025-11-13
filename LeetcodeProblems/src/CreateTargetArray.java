import java.util.Arrays;

public class CreateTargetArray
{
    public static void createTargetArrayOfLengthN(int n)
    {
        int[] result = new int[n];
        int index = 0;
        for(int i=1;i<=n/2;i++)
        {
            result[index++] = i;
            result[index++] = -i;
        }
        if(n%2==1) result[index] = 0;
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args)
    {
        int n = 5;
        createTargetArrayOfLengthN(n);
    }
}
