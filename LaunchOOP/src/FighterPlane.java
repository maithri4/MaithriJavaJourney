
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