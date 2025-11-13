@FunctionalInterface

interface Addition
{
    int add(int a, int b);
}

public class Demo
{
    public static void main(String[] args)
    {
        Addition obj = (a,b) -> a+b;

        int result = obj.add(10,20);
        System.out.println("Result is: "+result);
    }
}
