import java.util.Scanner;
class Palindrome 
{  
public static void main(String[] maithri)   
{  
int reverse = 0;  
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int number=sc.nextInt();
int temp=number;
while(number > 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
} 
if(temp==reverse)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}  
}
}
