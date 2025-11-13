public class ArithmeticProgression
{
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        System.out.println(isUniformDifference(nums));
    }
    static boolean isUniformDifference(int arr[])
    {
        if(arr.length<=2) return true;

        int diff = arr[1]-arr[0];
        for(int i=2;i< arr.length;i++)
            if(arr[i]-arr[i-1]!=diff)
                return false;
        
        return true;

    }
}
