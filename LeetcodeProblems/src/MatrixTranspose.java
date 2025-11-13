public class MatrixTranspose
{
    public static void transposeMatrix(int[][] matrix)
    {
        var rows=matrix.length;
        var cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                transpose[j][i] = matrix[i][j];
            }
        }
        for(int row[]:transpose)
        {
            for(int col:row)
                System.out.print(col+" ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][] matrix = {
                            {3,0,5},
                            {5,8,9},
                            {1,4,3}
                         };
        transposeMatrix(matrix);
    }
}
