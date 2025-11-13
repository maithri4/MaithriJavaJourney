class Airport
{
    public void permit(Aeroplane plane)
    {
        plane.takeOff();    //1:Many Forms
        plane.fly();
    }
}