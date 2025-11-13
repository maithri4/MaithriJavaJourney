//Demonstrating Method Overloading
public class MethodOverLoading
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public float add(float a,float b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        MethodOverLoading obj=new MethodOverLoading();
        System.out.println("Sum of two integers: "+obj.add(20,44));
        System.out.println("Sum of three integers: "+obj.add(1,2,3));
        System.out.println(obj.add(4.1d,0.7d));
    }
}
