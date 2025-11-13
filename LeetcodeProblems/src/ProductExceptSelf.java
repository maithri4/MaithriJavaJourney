import java.util.Arrays;

public class ProductExceptSelf
{
    static int[] productExceptSelf(int nums[])
    {
        int result[] = new int[nums.length];
//        Arrays.fill(result,1);
//        for(int i=0;i< nums.length;i++){
//            for(var j=0;j< nums.length;j++){
//                if(i!=j)
//                    result[i] *= nums[j];
//            }
//        }
        result[0]=1;
        for(int i=1;i< nums.length;i++)
            result[i] = result[i-1]*nums[i-1];
        var right = 1;
        for(int i=nums.length-1;i>=0;i--)
        {
            result[i] = result[i]*right;
            right *= nums[i];
        }
        return  result;
    }
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
