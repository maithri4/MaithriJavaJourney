//
//public class MaxProductSubArray
//{
//    public int maxProduct(int nums[])
//    {
//        int prefix = 1, suffix = 1, maxProd = Integer.MIN_VALUE;
//        var n = nums.length;
//        for(int i=0;i<n;i++)
//        {
//            if(prefix==0) prefix=1;
//            if(suffix==0) suffix=1;
//            prefix *= nums[i];
//            suffix *= nums[n-1-i];
//
//            maxProd = Math.max(maxProd, Math.max(prefix, suffix));
//        }
//        return maxProd;
//    }
//    public static void main(String[] args)
//    {
//        int arr[] = {3,-2,6,2,0,-3};
//        System.out.println(new MaxProductSubArray().maxProduct(arr));
//    }
//}
