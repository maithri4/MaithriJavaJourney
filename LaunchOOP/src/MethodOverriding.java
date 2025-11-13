//Demonstrating Dynamic Polymorphism
class A
{
  public void showTheDataBelongsToThisClass()
  {
      System.out.println("Class A");
  }
}
class B extends A
{
    @Override
    public void showTheDataBelongsToThisClass()
    {
        System.out.println("Class B");
    }
}
public class MethodOverriding
{
    public static void main(String[] args)
    {
        B obj=new B();
        obj.showTheDataBelongsToThisClass();
    }
}
