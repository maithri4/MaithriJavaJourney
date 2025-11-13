import java.util.Scanner;
public class MatrixTraverse
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
        System.out.println("Enter the element to be searched");
       x = input.nextInt();
        for ( i = 0; i < n; i++)
        {
          if(a[i]==x)
          {
           flag=1;
            break;
           }
        }
        if(flag==1)
       System.out.println("element found at position:"+(i+1));
       else
         System.out.println("element is not found :");
    }
}