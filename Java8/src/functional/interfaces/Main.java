package functional.interfaces;

@FunctionalInterface
interface Animal{
    void sound();
}

class Dog implements Animal
{
    @Override
    public void sound() {
        System.out.println("Dog says, bow bow");
    }
}

public interface Main {
    public static void main(String[] args)
    {
        Animal animal = new Animal()
        {
            @Override
            public void sound() {
                System.out.println("Dog says, bow bow");
            }
        };

        Animal animal1 = ()->System.out.println("Meow");
        animal1.sound();
    }
}
