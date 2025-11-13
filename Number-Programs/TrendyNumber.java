import java.util.Scanner;
public class TrendyNumber 
{
    public static void isTrendy(int num)
    {
        if(num>99 && num<1000)
        {
            num/=10;
            if((num%10)%3==0)
            {
                System.out.println("Given number "+num+" is a Trendy Number..!");
            }
            else
            {
                System.out.println("Given number "+num+" is not a Trendy Number..!");
            }
        }
        else
        {
            System.out.println("Invalid Number..!!");
        }  
    }
    public static void main(String[] args) 
    {
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter a number to be verified:");
        int num=sd.nextInt();
        isTrendy(num);
    }

}
