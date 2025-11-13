class Student
{  
int rollno;  
String name,course;  
float fee;  
Student(int rollno,String name,String course)
{  
this.rollno=rollno;  
this.name=name;  
this.course=course;  
}  
Student(int rollno,String name,String course,float fee)
{  
this(rollno,name,course); 
this.fee=fee;  
}  
void display()
{
System.out.println(rollno+" "+name+" "+course+" "+fee);
}  
}  
class ConstructorReuse
{  
public static void main(String args[])
{  
Student s1=new Student(589,"Jyothish","java");  
Student s2=new Student(112,"Akhil","java",4000f);  
s1.display();  
s2.display();  
}
}  