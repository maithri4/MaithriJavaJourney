import java.util.Arrays;

public class PrefixSum {
     static int[] findPrefixSum(int nums[])
     {
        for(int i=1;i< nums.length;i++)
            nums[i] = nums[i]+nums[i-1];

//         int prefixSum[] = new int[nums.length];
//         prefixSum[0]=nums[0];
//         for(int i=1;i< nums.length;i++)
//             prefixSum[i] = prefixSum[i-1]+nums[i];

        return nums;
    }
    public static void main(String[] args)
    {
        int arr[] = {4,21,24,9,5};
        System.out.println(Arrays.toString(findPrefixSum(arr)));
    }
}
