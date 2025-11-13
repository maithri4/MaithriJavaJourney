import java.util.Scanner;
public class AdamNumber 
{
    public static void isAdam(int num)
    {
        int temp=num;
        int rem,rn,sqr_rn,r_sqr_rn,sqr_n;
        r_sqr_rn = rn = 0;
        sqr_n = num*num;
        while(temp>0)
        {
            rem = temp%10;
            rn = rn*10+rem;
            temp/=10;
        }
        sqr_rn = rn*rn;
        while(sqr_rn>0)
        {
            r_sqr_rn = r_sqr_rn * 10 + sqr_rn%10;
            sqr_rn/=10;
        }
        if(r_sqr_rn == sqr_n)
        {
            System.out.println("Given number "+num+" is Adam number..!");
        }
        else{
            System.out.println("Given number "+num+" is not an Adam number..!");
        }
    }
public static void main(String[] args) 
{
    Scanner sd=new Scanner(System.in);
    System.out.println("Enter a number to be verified:");
    int n=sd.nextInt();
    isAdam(n);
    sd.close();
}
}
