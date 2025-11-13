abstract class Maithri
{
abstract void draw();
}
class Rectangle extends Maithri
{
void draw()
{
System.out.println("draw rectangle");
}
}
class AbstractClass
{
public static void main(String args[])
{
Maithri m=new Rectangle();
m.draw();
}
}