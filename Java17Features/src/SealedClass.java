

sealed class Vehicle permits Car, Tipper
{
    public int speed = 120;
    public void start()
    {
        System.out.println("Vehicle is starting.!");
    }
}

non-sealed class Car extends Vehicle
{
    public int speed = 143;
    public void start()
    {
        System.out.println("Car is going to start..!");
    }
}

final class Tipper extends Vehicle
{
  public int speed = 110;
  public void start()
  {
      System.out.println("Tipper is started.!");
  }
}

public class SealedClass
{
    public static void main(String[] args)
    {
        Vehicle vehicle1 = new Car();
        Tipper vehicle2 = new Tipper();
        vehicle1.start();
        System.out.println(vehicle1.speed);  // calls field of vehicle, referenced based.!
        System.out.println("----------------------------");
        vehicle2.start();
        System.out.println(vehicle2.speed);   // reference type is Tipper, so field of tipper is invoked
    }
}
