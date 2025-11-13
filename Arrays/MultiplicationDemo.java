import java.util.Scanner;

class MultiplicationWithoutAsterisk 
{
    public static void multiply(int n1,int n2)
    {
        int result=0;
        for(int i=1;i<=Math.abs(n2);i++)
        {
            result+=Math.abs(n1);
        }
        boolean is_negative = (n1>0 && n2<0) || (n1<0 && n2>0);
        if (is_negative == true)
        {
            result = -result;
        }
        System.out.println(n1+" multipliplied by "+n2+" is: "+result);
    }

}
public class MultiplicationDemo 
{
    public static void main(String[] args) 
    {
        Scanner sd=new Scanner(System.in);
        System.out.println("enter the values of n1 and n2:");
        int a = sd.nextInt();
        int b = sd.nextInt();
        MultiplicationWithoutAsterisk.multiply(a,b);
        sd.close();
    }

}
