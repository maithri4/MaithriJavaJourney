package Inheritence;
class Parent
{
    public void guides()
    {
        System.out.println("Parent guides the child!");
    }
}
class Child extends Parent
{
    public void learns()
    {
        System.out.println("child learns from the parent!");
    }
}
public class LaunchSingleInheritence
{
    public static void main(String[] args)
    {
        Child obj=new Child();
        obj.guides();
        obj.learns();
    }
}
