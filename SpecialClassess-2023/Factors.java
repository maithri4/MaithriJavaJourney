import java.util.Scanner;
public class Factors
 {

  public static void main(String[] args)
 {
Scanner c=new Scanner(System.in);
    int number =c.nextInt();

    for (int i = 1; i <= number; i++)
 {

      if (number % i == 0) 
{
        System.out.print(i);
if(i!=number)
   System.out.print(",");
    }
  }
}
}