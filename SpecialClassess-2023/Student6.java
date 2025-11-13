class Student6
{
int id;
String name;
Student6(int a,String n)
{
id=a;
name=n;
}
Student6(Student6 s)
{
id=s.id;
name=s.name;
}
void disp()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Student6 j=new Student6(18,"mai");
Student6 j1=new Student6(j);
j.disp();
j1.disp();
}
}