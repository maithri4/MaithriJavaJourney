import java.util.Scanner;
class MatrixMultiplicationDemo
{
    public void multiply(int b1[],int  b2[])
    {
        int m1[][] = new int[b1[0]][b1[1]];
        int m2[][] = new int[b2[0]][b2[1]];
        int res[][] =new int[b1.length][b2[0].length];
        System.out.println("enter the elements of matrix-1:");
        Scanner sd = new Scanner(System.in);
        for(int i=0;i<m1.length;i++)
        {
            for(int j=0;j<m1[i].length;j++)
            {
                m1[i][j] = sd.nextInt();
            }
        }
        System.out.println("enter the elements of matrix-2:");
        for(int i=0;i<m2.length;i++)
        {
            for(int j=0;j<m2[i].length;j++)
            {
                m2[i][j] = sd.nextInt();
            }
        }
        //multiplying the matrices
        for(int i=0;i<m1.length;i++)
        {
            for(int j=0;j<m2[i].length;j++)
            {
                for(int k=0;k<res.length;k++)
                {
                    res[i][j] = res[i][j] + m1[i][k] * m2[k][j];
                }
            }
        }
        System.err.println("printing the elements of the resultant matrix:");
        for(int row[]:res)
        {
            for(int col:row)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

public class MatrixMul 
{
public static void main(String[] args) 
{
    MatrixMultiplicationDemo obj = new MatrixMultiplicationDemo();
    System.out.println("enter the base of the matrices:");
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    obj.multiply(n);
    s.close();
}
}
