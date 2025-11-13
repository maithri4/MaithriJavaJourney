public class DiagonalDifference
{
    public int absoluteDiagonalDifference(int matrix[][])
    {
        int sum1,sum2,n;
        sum1=sum2=0;
        n=matrix.length;
        for(int i=0;i<matrix.length;i++)
        {
            sum1 += matrix[i][i];
            sum2 += matrix[i][n-i-1];
        }
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1,0,5},
                {5,4,9},
                {1,4,3}
                };
        System.out.println(new DiagonalDifference().absoluteDiagonalDifference(matrix));
    }
}
