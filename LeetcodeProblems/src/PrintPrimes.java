import java.util.Arrays;
public class PrintPrimes
{
    public static void printPrimes(int n)
    {
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,2,n+1,true);

        for(int i=2;i*i<=n;i++)
        {
            if(isPrime[i])
            {
                for(int j=i+i;j<=n;j+=i)
                    isPrime[j] = false;
            }
        }
        for(int i=2;i<=n;i++)
            if(isPrime[i])
                System.out.print(i+" ");
    }
    public static void main(String[] args)
    {
        printPrimes(7+13);
        System.out.println();
    }
}
