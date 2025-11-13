class Maithri
{
void add()
{
System.out.println("Maithri Age:20");
}
}
class Jyothish extends Maithri
{
 void add()
{
super.add();
System.out.println("Jyothish Age:18");
}
}
class Super
{
public static void main(String args[])
{
Jyothish c=new Jyothish();
c.add();
}
}