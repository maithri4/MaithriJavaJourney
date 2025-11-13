import java.util.Scanner; 
class AsciiValue   
{  
public static void main(String[] args)   
{   
Scanner sc=new Scanner(System.in);
System.out.println("enter a character:");
char c1 =sc.next().charAt(0);
int av1 = c1;  
System.out.println("The ASCII value of " + c1 + " is: " + av1);  
}
}