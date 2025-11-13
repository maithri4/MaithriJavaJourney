
// Method hiding
class Parent
{
    int a = 20;
     void show()
    {
        System.out.println("Parent show");
    }
}

class Child extends Parent
{
     void show()
    {
        super.show();
        System.out.println(super.a);
        System.out.println("Child show");
    }
}

public class MethodOverriding2
{
    public static void main(String[] args)
    {
        Parent obj = new Child();
        obj.show();
    }
}
