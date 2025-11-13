import java.util.Scanner;

public class ProdOfDigits 
{
    public static void main(String[] args) 
    {
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sd.nextInt();
        int temp=num;
        int prod=1;
        while(num>0)
        {
            int rem=num%10;
            prod*=rem;
            num/=10;
        }
        System.out.println("Product of digits of a given number "+temp+" is: "+prod);
        
    }

}
