import java.util.Scanner;
public class MatrixSorting2
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
    for( i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
 System.out.println("Sorting elements in ascending order:");
     for(int v:a)
    {
    System.out.print(v+"  ");
   }
}
}
      