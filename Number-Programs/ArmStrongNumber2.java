public class ArmStrongNumber2 
{
public static void main(String[] args) 
{
    int n,temp,rem;
    n=temp=153;
    int sum=0;
    while(temp>0)
    {
        rem = temp%10;
        sum += rem*rem*rem;
        temp/=10;
    }
    if(n==sum)
    {
        System.out.println("Given number "+n+" is an ArmStrongNumber");
    }
    else
    {
        System.out.println("Given number "+n+" is not an ArmStrongNumber");
    }
}
}
