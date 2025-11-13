import java.util.*;
public class FindCommonElements
{
    public static List<Integer> intersection(int nums1[], int nums2[])
    {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int num : nums1)
            set.add(num);

        for(int num : nums2)
            if(set.contains(num))
                res.add(num);

        return res;
    }
    public static void main(String[] args)
    {
        int arr1[] = {10,20,40};
        int arr2[] = {40,20,100};

        System.out.println(FindCommonElements.intersection(arr1, arr2));
        //System.out.println(FindCommonElements.intersection(new int[]{10,20,40},  new int[]{40,20,100}));
    }
}
