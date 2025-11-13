import java.util.function.BinaryOperator;

public class LaunchBinaryOperator
{
    public static void main(String[] args)
    {

        BinaryOperator<Integer> binOp = new BinaryOperator<>()  //Integer::sum;
        {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };
        System.out.println("Sum of 300 and 5 is: "+binOp.apply(300, 5));
    }
}
