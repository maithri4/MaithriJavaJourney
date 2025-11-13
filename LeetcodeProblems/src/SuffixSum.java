import java.util.Arrays;

public class SuffixSum
{
    public static void main(String[] args)
    {
        int arr[] = {4,21,24,9,5};
        System.out.println(Arrays.toString(findSuffixSum(arr)));
    }

    static int[] findSuffixSum(int arr[])
    {
        int n = arr.length;
//        for(int i=n-2;i>=0;i--)
//            arr[i] = arr[i]+arr[i+1];

        int suffixSum[] = new int[n];
        suffixSum[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--)
            suffixSum[i] = arr[i]+suffixSum[i+1];

        return suffixSum;
    }
}
