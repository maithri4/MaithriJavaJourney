package PackageDemo;

import Inheritence.LaunchSingleInheritence;
import Test.Bike;

class Creta extends Car
{
    public void run()
    {
        System.out.println("It is an amazing car!");
    }
}

class Ktm extends Bike
{
  public void showKtm()
  {
      System.out.println(capacity);
  }
}
public class Vehicle
{
    public static void main(String[] args)
    {
//        Car c=new Car();
//        c.run();
//        System.out.println("Car is running at a speed of: "+c.speed);
//
//        Creta ct=new Creta();
//        ct.run();

        Ktm ktm=new Ktm();
        ktm.showKtm();
    }
}
