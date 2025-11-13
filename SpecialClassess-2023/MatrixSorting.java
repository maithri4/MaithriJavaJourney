import java.util.Scanner;
import java.util.Arrays;
public class MatrixSorting
{
    public static void main(String args[])
    {
        int n,x,i=0,flag=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of matrix:");
        n = input.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of matrix");
        for ( i = 0; i < n; i++)
        {
                a[i] = input.nextInt();
         
      }
    Arrays.sort(a);
    System.out.println("Sorting elements in ascending order:");
     for ( i = 0; i < n; i++)
    {
    System.out.print(a[i]+"  ");
   }
}
}
      