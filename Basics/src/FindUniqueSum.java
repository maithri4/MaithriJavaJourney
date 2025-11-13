import java.util.*;

class UniqueNumbersSum
{
    public static int uniqueSum(int arr[])
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : arr)
        {
            //boolean hasAdded = set1.add(num);
            if(!(set1.add(num)))
                duplicates.add(num);
        }
        int sum=0;
        set1.removeAll(duplicates);
        for(int num : set1)
            sum += num;

//        for(int num : set1)
//        {
//            if(! set2.contains(num))
//                sum += num;
//        }

        return sum;
    }
}

public class FindUniqueSum
{
    public static void main(String[] args)
    {
        var nums = new int[]{10,10,45,53,20,20,10};
        System.out.println(UniqueNumbersSum.uniqueSum(nums));
    }
}
