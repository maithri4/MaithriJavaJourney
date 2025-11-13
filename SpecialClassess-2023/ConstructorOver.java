class ConstructorOver
{
ConstructorOver(int a)
{
System.out.println("value of a="+a);
}
ConstructorOver(int a,int b)
{
System.out.println("sum of a&b="+(a+b));
}
public static void main(String args[])
{
ConstructorOver j=new ConstructorOver(4);
ConstructorOver j1=new ConstructorOver(4,4);
}
}