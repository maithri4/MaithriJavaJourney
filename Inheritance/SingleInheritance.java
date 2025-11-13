class Apple
{
void mai()
{
System.out.println("This is Parent class");
}
}
class Maithri extends Apple
{
void display()
{
System.out.println("This is Child class");
}
}
class SingleInheritance
{
public static void main(String mai[])
{
Maithri m=new Maithri();
m.mai();
m.display();
}
}