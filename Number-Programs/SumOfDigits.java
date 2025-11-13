import java.util.Scanner;

public class SumOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sd.nextInt();
        int temp=num;
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println("Sum of digits of a given number "+temp+" is:"+sum);
        
    }

}
