class Aeroplane
{
    public void takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane
{
    @Override
    public void takeOff()
    {
        System.out.println("CargoPlane takes longer runway to take off");
    }
    @Override
    public void fly()
    {
        System.out.println("CargoPlane flyes at lower height");
    }
}
class FighterPlane extends Aeroplane
{
    @Override
    public void takeOff()
    {
        System.out.println("FighterPlane takes shorter runway to take off");
    }
    @Override
    public void fly()
    {
        System.out.println("FighterPlane flyes at higher height");
    }
}
class Airport
{
    public void permit(Aeroplane plane)
    {
        plane.takeOff();    //1:Many Forms
        plane.fly();
    }
}
public class LaunchPolymorphism
{
    public static void main(String[] args)
    {
        CargoPlane plane1=new CargoPlane();
//        plane1.takeOff();
//        plane1.fly();

        FighterPlane plane2=new FighterPlane();
//        plane2.takeOff();
//        plane2.fly();

        Airport airport=new Airport();
        airport.permit(plane1);
        System.out.println("-------------------------------------------");
        airport.permit(plane2);
    }
}