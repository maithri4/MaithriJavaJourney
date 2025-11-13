import java.util.*;
class CalendarCollection
{
public static void main(String args[])
{
Calendar c=Calendar.getInstance();
System.out.println("current date:"+c.getTime());
c.add(Calendar.DATE,-4);
System.out.println("Before 4 Days:"+c.getTime());
c.add(Calendar.DATE,18);
System.out.println("After 18 days:"+c.getTime());
c.add(Calendar.MONTH,7);
System.out.println("After 7 Months:"+c.getTime());
c.add(Calendar.YEAR,2);
System.out.println("After 2 Years:"+c.getTime());
}
}