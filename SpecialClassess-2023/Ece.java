class Cse
{
private int age;
public void setAge(int age)
{
if(age<0)
this.age=0;
else
this.age=age;
}
public int getAge()
{
return this.age;
}
}
class Ece
{
public static void main(String args[])
{
Cse c=new Cse();
c.setAge(18);
System.out.println("Age:"+c.getAge());
}
}