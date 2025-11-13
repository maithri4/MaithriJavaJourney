import java.util.Scanner;
public class ReverseNum 
{
    public static void main(String[] args) 
    {
        Scanner sd=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sd.nextInt();
        int temp=num;
        int rev=0;
        while(num>0)
        {
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("Reverse of digits of a given number "+temp+" is:"+rev);
        
    }

}
