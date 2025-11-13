import java.util.Scanner;
class NaturalSumDoWhile
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
System.out.println("enter n value:");
int num=sc.nextInt();
int i=1,sum = 0;  
do
{  
sum = sum + i;  
i++;
}    
while(i<=num);
System.out.println("Sum of First "+num+" Natural Numbers is = " + sum);  
}  
}  