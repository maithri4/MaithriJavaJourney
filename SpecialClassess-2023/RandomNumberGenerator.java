import java.util.Random;
class RandomNumberGenerator
{
public static void main(String args[])
{
Random rand=new Random();
boolean rand_num = rand.nextBoolean();

System.out.println("random number:"+rand_num);
}
}