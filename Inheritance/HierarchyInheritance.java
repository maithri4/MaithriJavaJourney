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
System.out.println("This is First Derived class");
}
}
class Jessi extends Apple
{
void apple()
{
System.out.println("This is Second Derived class");
}
}
class HierarchyInheritance
{
public static void main(String mai[])
{
Maithri m=new Maithri();
Jessi j=new Jessi();
m.mai();// or j.mai();
m.display();
j.apple();
}
}