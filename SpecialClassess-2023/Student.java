class Student
{
int age;
String name;
}
class StudentRef
{
public static void main(String args[])
{
Student st=new Student();
st.age=18;
st.name="mai";
System.out.println(st.id+" "+st.name);
}
}