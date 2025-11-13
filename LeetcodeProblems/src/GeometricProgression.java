public class GeometricProgression
{
    static boolean isGeometricProgression(int arr[])
    {
        if(arr.length<=2) return true;
        if(arr[0]==0) return false;

        double ratio = (double) arr[1]/arr[0];
        for(int i=2;i< arr.length;i++){
            if(arr[i-1]==0 || (double) arr[i]/arr[i-1]!=ratio)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(isGeometricProgression(new int[]{3,6,12,24}));
        System.out.println(isGeometricProgression(new int[]{3,6,9}));
    }
}
