import java.util.Scanner;
public class ArmStrongNumber 
{
    public boolean isArmStrong(int num)
    {
        String numStr = Integer.toString(num);
        int sum=0;
        int digits = numStr.length();
        for (char c : numStr.toCharArray()) 
        {
            sum+=Math.pow(Character.getNumericValue(c),digits);
        }
        return sum==num;
    }
    public static void main(String[] args) 
    {
     ArmStrongNumber obj=new ArmStrongNumber();
     Scanner sd=new Scanner(System.in);
     System.out.println("Enter a number to be verified:");
     int n=sd.nextInt();
     boolean isTrue = obj.isArmStrong(n);
    if(isTrue)
    {
        System.out.println("Given number "+n+" is an ArmStrongNumber");
    }
    else
    {
        System.out.println("Given number "+n+" is not an ArmStrongNumber");
    }
    }
}
