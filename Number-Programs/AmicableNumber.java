import java.util.Scanner;
public class AmicableNumber 
{   
     public static void main(String[] args) 
    {
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter a number to be verified:");
        int num=sd.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum1+=i;
            }
        }
        for(int i=1;i<sum1;i++)
        {
            if(sum1%i==0)
            {
                sum2+=i;
            }
        }
        System.out.println(sum2);
        if(num == sum2)
        {
            System.out.println("Given number "+num+" is an Amicable Number..!!");
        }
        else
        {
            System.out.println("Given number "+num+" is not an Amicable Number..!!");
        }

    }
}
