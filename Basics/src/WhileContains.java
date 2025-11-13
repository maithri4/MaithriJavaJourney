import java.util.*;

public class WhileContains
{
    static int containsOriginal(int nums[], int original)
    {
        for(int num:nums)
        {
            if(num == original)
                original = num*2;
        }

        return original;
    }
    public static void main(String[] args)
    {
        int arr[] = {2, 4, 8, 25, 16, 90};
        int original = 4;   //2*2=4, 4*2=8, 8*2=16, 16*2=32

        System.out.println(containsOriginal(arr,2));
    }
}

