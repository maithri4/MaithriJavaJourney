public class ArmStrongNumber
{
    public static void main(String[] args)
    {

//        if(isArmStrong())
//            System.out.println("Given number is ArmStrong");
//        else
//            System.out.println("Not an Armstrong number!");
        for(int i=1; i<=1000; i++)
        {
            if(isArmStrong(i))
                System.out.print(i+"  ");
        }
    }
    public static boolean isArmStrong(int num)
    {
        int sum = 0;
        for(char c : String.valueOf(num).toCharArray())
            sum += (int) Math.pow(Character.getNumericValue(c), String.valueOf(num).length());
        
        return num == sum;
    }
}
