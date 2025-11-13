import java.util.Arrays;

class DiagonalSum
{
    public static int diagonalSum(int[][] mat)
    {
        var n = mat.length;
        var sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += mat[i][i];
            sum += mat[i][n - i - 1];
        }
        if (n % 2 == 1)  sum -= mat[n / 2][n / 2];

        return sum;
    }

    public static void main(String[] args)
    {
        int[][] matrix = {
                {1,0,5},
                {5,4,9},
                {1,4,3}
        };
        System.out.println(diagonalSum(matrix));
    }
}