import java.util.Scanner;

public class RemoveDuplicates
{
    public static int removeDuplicates(int[] nums)
    {
        int i=0;
        for(int j=1;j< nums.length;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter size of the Array.");
        int n = sd.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sd.nextInt();
        sd.close();

        n=removeDuplicates(arr);
        for (int i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }
}
