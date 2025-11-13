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