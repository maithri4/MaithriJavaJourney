class MultiDimentionalArrays
{
public static void main(String args[])
{
int nums[ ][ ] = { {13, 21, 33, 47},
                         {52, 16, 73, 81},
                         {69, 10, 11, 12}
                       };
for(int row[]: nums)
{
for(int vals: row)
{
System.out.print(vals+"  ");
}
System.out.println();
}
}
}