class Student7
{
int id;
String name;
Student7(int a,String n)
{
id=a;
name=n;
}
Student7()
{
}
void disp()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student7 s1=new Student7(18,"Apple");
Student7 s2=new Student7();
s2.id=s1.id;
s2.name=s1.name;
s1.disp();
s2.disp();
}
}