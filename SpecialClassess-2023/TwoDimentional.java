class TwoDimentional
{
public static void main(String args[])
{
int arr[][]=new int[2][2];
arr[0][0]=1;  
arr[0][1]=2;  
arr[1][0]=8;  
arr[1][1]=4;    
System.out.println("Accessing elements of array:");
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr.length;j++)
{
System.out.println(arr[i][j]+" ");
}
}
}
}