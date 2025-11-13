class Student
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public int getId()
{
return this.id;
}
public String getName()
{
return this.name;
}
}
class PrivateAccess
{
public static void main(String args[])
{
Student s3=new Student[1];
s3.setId(28505);
s3.setName("jyothish");
System.out.println("Id:"+s3.getId());
System.out.println("Name:"+s3.getName());
}
}