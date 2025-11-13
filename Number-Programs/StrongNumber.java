import java.util.Scanner;
public class StrongNumber 
{
    int rem;
    int sum=0;
    int i;
    int fact;
    public boolean strongNumber(int num)
    {
        int temp=num;
        while(temp>0)
        {
            rem=temp%10;
            fact=i=1;
            while(i<=rem)
            {
                fact*=i;
                i+=1;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==num)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
public static void main(String[] args) 
 {
    StrongNumber obj=new StrongNumber();
    Scanner sd=new Scanner(System.in);
    System.out.println("Enter a number to be verified:");
    int n=sd.nextInt();
    sd.close();
    if(obj.strongNumber(n))
    {
        System.out.println("Given Number "+n+" is a Strong Number..!");
    }
    else
    {
        System.out.println("Given Number "+n+" is not a Strong Number..!");
    }

 }
}
