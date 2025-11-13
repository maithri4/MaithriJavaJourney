class B
{
public int x;
public static void setX(int a)
{
x=a;
}
}
class Af
{
public static void main(String args[])
{
System.out.println("GoodMorning");
B b=new B();
b.setX(10);
System.out.println("X:"+b.x);
}
}