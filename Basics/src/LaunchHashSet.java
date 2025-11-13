import java.util.*;
public class LaunchHashSet
{
    public static void main(String[] args)
    {
        Set<Integer> nums = new HashSet<>();
        Set<Integer> nums2 = new HashSet<>();
        nums2.add(40);
        nums2.add(30);
        nums2.add(50);

        System.out.println(nums2);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(100);
        boolean bool = nums.add(305);
        System.out.println(bool);
        System.out.println(nums);
        System.out.println("nums contains '305': "+nums.contains(305));
        nums.addAll(nums2);

        nums.retainAll(nums2);
        System.out.println(nums.isEmpty());
        nums.clear();
        System.out.println(nums.isEmpty());














//        nums.addAll(nums2);
//        System.out.println(nums);
//        nums.removeAll(nums2);
//        System.out.println(nums);
//        nums.remove(30-10);
//        System.out.println(nums);
//        nums.clear();
//        System.out.println(nums);
    }
}
