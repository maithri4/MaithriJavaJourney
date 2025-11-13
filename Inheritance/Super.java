class A
{
void mai()
{
System.out.println("Parent class");
}
}
class B extends A
{
void mai()
{
super.mai();
System.out.println("Child class");
}
}
class Super
{
public static void main(String args[])
{
B b=new B();
b.mai();
}
}