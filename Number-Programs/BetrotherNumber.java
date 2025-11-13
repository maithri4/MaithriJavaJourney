import java.util.Scanner;

public class BetrotherNumber 
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
      sum1-=1;
        for(int i=1;i<sum1;i++)
        {
            if(sum1%i==0)
            {
                sum2+=i;
            }
        }
        System.out.println(sum2);
        if(num+1 == sum2)
        {
            System.out.println("Given number "+num+" is a Betrother Number..!!");
        }
        else
        {
            System.out.println("Given number "+num+" is not a Betrother Number..!!");
        }

    }
}
