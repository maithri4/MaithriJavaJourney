class Finally
{
public static void main(String args[])
{
try
{
int num=12/0;
System.out.println(num);
}
catch(NullPointerException n)
{
System.out.println(n);
}
System.out.println("Apple");
finally
{
System.out.println("finally block is always executed");
}
}
}

