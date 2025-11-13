class CloneInstance implements Clonable
{
void mai(int a)
{
System.out.println("Object is created Without using new keyword");
System.out.println(a);
}
public static void main(String args[])throws CloneNotSupportedException
{
CloneInstance c=new CloneInstance();
CloneInstance ci=c.clone();
ci.mai(4);
}
}
