class Student
{
int no;
String name;
void mai(int a,String s)
{
no=a;
name=s;
}
void disp()
{
System.out.println(no+"  "+name);
}
}
class StudentMethod
{
public static void main(String args[])
{
Student st=new Student();
Student s=new Student();
st.mai(18,"Apple");
s.mai(19,"mai");
st.disp();
s.disp();
}
}