public class MaximumSubArray
{
    public static int maxSumSubArray(int nums[])
    {
        int maxSum = 0, sum = 0;
        for(int num:nums)
        {
            sum += num;
            if(sum<0) sum = 0;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args)
    {
        int nums[] = {5,4,-1,7,8};
        System.out.println(maxSumSubArray(nums));
    }
}
