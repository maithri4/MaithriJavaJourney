public class NPermutations
{
    public static int find_permutations(String s)
    {
        int n=s.length();
        long fact = factorial(n);
        int freq[]=new int[26];
        for(char c:s.toLowerCase().toCharArray())
            freq[c-'a']++;

        for(int f:freq)
        {
            if(f>1)
             fact/=factorial(f);
        }
        return (int)fact;
    }
    public static int factorial(int n)
    {
        if(n<=1) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args)
    {
        System.out.println(find_permutations("abc"));
    }
}
