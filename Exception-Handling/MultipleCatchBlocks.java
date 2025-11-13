class MultipleCatchBlocks
{
void mai()
{
System.out.println("Object is created Without using new keyword");
}
public static void main(String args[])
{
try
{
Class c=Class.forName("MultipleCatchBlocks");
MultipleCatchBlocks n=(MultipleCatchBlocks)c.newInstance();
n.mai();
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
