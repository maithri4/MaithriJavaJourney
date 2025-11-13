import java.util.Scanner;

public class PerfectNumber 
{
    public static void main(String[] args) 
    {
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter a number to be verified:");
        int num=sd.nextInt();
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(sum==num)
        {
            System.out.println("Given Number "+num+" is a Perfect Number..!");
        }
        else if(sum>num)
        {
            System.out.println("Given Number "+num+" is an Abundant Number..!");
        }
        else
        {
            System.out.println("Given Number "+num+" is a Deficite Number..!");
        }
        
    }
}
