public class CanConstructorBeFinal
{
   /* final */ CanConstructorBeFinal()      //modifier final not allowed here
    {
        System.out.println("This is a constructor");
    }
    public static void main(String[] args)
    {
        CanConstructorBeFinal obj = new CanConstructorBeFinal();
    }
}
