
class Parent
{
    static String message = "Hello from Parent's static field";
    static void showMessage()
    {
        System.out.println("Hello from Parent's static method");
    }
}

class Child extends Parent
{
    void accessParentStatic()
    {
        System.out.println(Parent.message);
        Parent.showMessage();
//        System.out.println(message);
//        showMessage();

//        System.out.println(Child.message);
//        Child.showMessage();
    }
}

public class AccessParentStaticMembers {
    public static void main(String[] args)
    {
        Child c = new Child();
        c.accessParentStatic();
    }
}
