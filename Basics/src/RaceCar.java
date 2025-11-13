public interface RaceCar
{
    void start(int speed);
    default void show()
    {
        System.out.println("Car1");
    }
    static void disp()
    {
        System.out.println("Car2");
    }
}

class Mai // using lambda expressions.
{
    public static void main(String[] args)
    {
        RaceCar obj = System.out::println;

        obj.show();
        obj.start(305);
        RaceCar.disp();
    }
}
/*
Car1
305
Car2
 */
