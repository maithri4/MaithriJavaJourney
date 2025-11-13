
@FunctionalInterface

interface Functional
{
    void display();
}
//class A implements Functional
//{
//    public void display()
//    {
//        System.out.println("Hello, Welcome to java 8 features!");
//    }
//}
public class LambdaExps
{
    public static void main(String[] args)
    {
//        Functional obj=new Functional()
//        {
//            public void display()
//            {
//                System.out.println("Anonymous Inner class.!");
//            }
//        };

        Functional obj = () -> System.out.println("welcome to lambda expressions");
        obj.display();
    }
}
