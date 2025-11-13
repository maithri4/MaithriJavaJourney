import java.util.Arrays;

public class Arrays1
{
    public static void main(String[] args)
    {
        int nums1[] = {1,4,3};
        int nums2[] = nums1;
        nums2[0] = 143;
        System.out.println(Arrays.toString(nums1));    // Before cloning
        System.out.println(Arrays.toString(nums2));
        nums2 = nums1.clone();
        nums2[0] = 10;
        System.out.println("-------------");
        System.out.println(Arrays.toString(nums1));    // After cloning
        System.out.println(Arrays.toString(nums2));
    }
}
