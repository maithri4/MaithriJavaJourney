class NewInstance
{
void mai(int a)
{
System.out.println("Object is created Without using new keyword");
System.out.println(a);
}
public static void main(String args[])
{
try
{
Class c=Class.forName("NewInstance");
NewInstance n=(NewInstance)c.newInstance();
n.mai(4);
}
catch(ClassNotFoundException e)
{
}
catch(InstantiationException f)
{
}
catch(IllegalAccessException r)
{
}
}
}
