import java.util.Scanner;
class ArrayLarg
{
    public static int larg(int arr[])
  {
    int lar=arr[0];
    for(int num:arr)
    {
        if(num>lar)
        lar=num;
    }
        return lar;
  }
public static void main(String sg[])
  {
    int array[]={1,5,2,34,23};
    System.out.println("largest element in the given array:"+larg(array));
  }
}
