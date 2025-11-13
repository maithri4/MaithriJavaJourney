class MinInRotatedSortedArray
{
    public static int findMin(int[] nums)
    {
        int min = Integer.MAX_VALUE;
        int left = 0, right = nums.length-1;
        while(left<=right)
        {
            var mid = left+(right-left)/2;
            if(nums[left] <= nums[mid])
            {
                min = Math.min(min, nums[left]);
                left = mid+1;
            }
            else
            {
                min = Math.min(min, nums[mid]);
                right = mid-1;
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        int arr[] = {3,4,5,1,2};
        System.out.println(findMin(arr));
    }
}