import java.util.Scanner;
class AdvancedSwitchCase
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
String result=" ";
String n=s.next();
result=switch(n)
{
case "monday" ->  System.out.println("Monday");
case "tuesday" ->  System.out.println("Tuesday");
case "wednesday" ->  System.out.println("Wednesday");
case "thursday" ->  System.out.println("Thursday");
case "friday" ->  System.out.println("Friday");
case "saturday" ->  System.out.println("Friday");
default ->   System.out.println("Sunday");
}
}
}