public interface Car
{
    int start(int speed);
}

class Main
{
    public static void main(String[] args)
    {
        Car car = speed -> speed;
        int result = car.start(143);
        System.out.println("Car is Running at "+result+" kmph");
    }
}
