class Access
{
 int id;
 String name;
}
class TestAccess
{
public static void main(String args[])
{
Access a=new Access();
System.out.println(a.id+" "+a.name);
a.id=28505;
a.name="Java";
System.out.println(a.id+" "+a.name);
}
}