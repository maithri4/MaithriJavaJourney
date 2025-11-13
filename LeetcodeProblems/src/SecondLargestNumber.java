public class SecondLargestNumber
{
    static int secondLargestNumber(int nums[])
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num : nums)
        {
            if(num>largest){
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest && num!=largest) {
                secondLargest=num;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] nums = {32,4,38,42,31,2,12};
        System.out.println(secondLargestNumber(nums));
    }
}
