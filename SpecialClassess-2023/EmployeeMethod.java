class Employee
{
int eid;
String ename;
String edept;
void mai(int a,String s1,String s2)
{
eid=a;
ename=s1;
edept=s2;
}
void disp()
{
System.out.println(eid+"  "+ename+"  "+edept);
}
}
class EmployeeMethod
{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.mai(589,"Jyothish","CSE");
e2.mai(544,"Sameer","ECE");
e3.mai(582,"Bharath","EEE");
e1.disp();
e2.disp();
e3.disp();
}
}