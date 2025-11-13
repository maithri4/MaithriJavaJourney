class Employee
{
int salary=1000;
}
class Programmer extends Employee
{
int bonus=400;
void mai()
{
System.out.println("Salary="+salary);
System.out.println("Bonus="+bonus);
}
}
class SingleInheritance
{
public static void main(String mai[])
{
Programmer p=new Programmer();
p.mai();
}
}