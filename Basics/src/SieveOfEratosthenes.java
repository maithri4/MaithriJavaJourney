import java.util.ArrayList;
import java.util.Arrays;

public class SieveOfEratosthenes
{
    public static void findPrimes(int n)
    {
        int count=0;

        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, 2, n+1,true);

        for(int i=2;i*i<=n;i++)
        {
            if(isPrime[i])
            {
                for(int j=i*i; j<=n; j+=i)
                    isPrime[j] = false;
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
                System.out.print(i+"  ");
        }

    }
    public static void main(String[] args)
    {
        findPrimes(15);
    }
}
