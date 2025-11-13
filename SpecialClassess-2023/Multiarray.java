import java.util.Scanner;
public class Multiarray
{
    public static void main(String args[])
    {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("printing array values");
        for (int i = 0; i< a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
         System.out.print(a[i][j]+" ");
            }
        }

    }
}