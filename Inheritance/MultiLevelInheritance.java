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
System.out.println("This is Intermediate class");
}
}
class Jessi extends Maithri
{
void apple()
{
System.out.println("This is Child class");
}
}
class MultiLevelInheritance
{
public static void main(String mai[])
{
Jessi m=new Jessi();
m.mai();
m.display();
m.apple();
}
}