import java.util.Arrays;
public class SortMethod 
{
 public static void main(String[] args) 
 {
    int arr[] = {27879,5,44,143,8,4};
    int sort_arr[]=sortArray(arr);
    System.out.println("Sorted Array: "+Arrays.toString(sort_arr));
 }   
 public static int[] sortArray(int arr[])
 {
    Arrays.sort(arr);
    return arr;
 }
}