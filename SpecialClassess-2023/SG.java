class IdCard
{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private String student_name;
private String course_name;
private long aadhar_number;
public void setNames(String college_name,String college_address,String student_name,String course_name)
{
this.college_name=college_name;
this.college_address=college_address;
this.student_name=student_name;
this.course_name=course_name;
}
public void setNo(int ay_start,int ay_end)
{
this.ay_start=ay_start;
this.ay_end=ay_end;
}
public String getNames()
{
return college_name;
return college_address;
return student_name;
return course_name;
}
public int getNo()
{
return ay_start;
return ay_end;
}
public void setAadhar(long aadhar_number)
{
this.aadhar_number=aadhar_number;
}
public long getAadhar()
{
return aadhar_number;
}
}
class SG
{
public static void main(String args[])
{
IdCard s=new IdCard();
s.setNames("MTIE","PALAMANER","JYOTHISH","CSE");
s.setNo(2223,2526);
s.setAadhar(33668488);
System.out.println("College Name:College Address:Student Name:Course Name:"+s.getNames());
System.out.println("Ay_Start:Ay_end:Aadhar Number:"+s.getNo());
System.out.println("Aadhar number:"+s.getAadhar());
}
}