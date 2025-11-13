class A
{
A()
{
this(9);
System.out.println("Hello A from Default Constructor");
}
A(int a)
{
System.out.println(a);
}
}
class ThisConstructor2
{
public static void main(String mai[])
{
A a1=new A();
}
}