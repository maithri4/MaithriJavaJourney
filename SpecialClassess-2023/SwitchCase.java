import java.util.Scanner;
class SwitchCase
{
public static void display(int n)
{
switch(n)
{
case 0:
System.out.println("Monday");
break;
case 1:
System.out.println("Tuesday");
break;
case 2:
System.out.println("Wednesday");
break;
case 3:
System.out.println("Thursday");
break;
case 4:
System.out.println("Friday");
break;
case 5:
System.out.println("Saturday");
break;
default:
System.out.println("Sunday");
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int n=s.nextInt();
display(n);
}
}
