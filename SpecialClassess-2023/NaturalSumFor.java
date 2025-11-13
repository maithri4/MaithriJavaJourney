import java.util.Scanner;
class NaturalSumWhile
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
System.out.println("enter n value:");
int num=sc.nextInt();
int i=1,sum = 0;  w
while(i<=num)
{  
sum = sum + i;  
}    
System.out.println("Sum of First "+num+" Natural Numbers is = " + sum);  
}  
}  