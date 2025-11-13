class Encrypt
{
    public static void main(String args[])
    {
        int num = 89;
        int len = Integer.toString(num).length();
        int maxDigit = -1;
        while(num>0)
        {
            int digit = num%10;
            maxDigit = Math.max(maxDigit, digit);
            num/=10;
        }
        int encrypt = 0;
        for(int i=1;i<=len;i++)
            encrypt = encrypt * 10 + maxDigit;

        System.out.println(encrypt);
    }
}
