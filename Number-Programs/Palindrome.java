import java.util.Scanner;
public class Palindrome 
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
        if(rev==temp)
        {
            System.out.println("Given number "+temp+" is palindrome..!");
        }
        else
        {
            System.out.println("Given number "+temp+" is not palindrome..!"); 
        }
    }

}
