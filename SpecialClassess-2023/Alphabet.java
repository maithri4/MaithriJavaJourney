import java.util.Scanner;
class Alphabet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("INPUT:");
char a=s.nextLine().charAt(0);
if(a=='a'||a=='b'||a=='c'||a=='d'||a=='e'||a=='f'||a=='g'||a=='h'||a=='i'||a=='j'||a=='k'||a=='l'||a=='m'||a=='n'||a=='o'||a=='p'||a=='q'||a=='r'||a=='s'||a=='t'||a=='u'||a=='v'||a=='w'||a=='x'||a=='y'||a=='z')
{
System.out.println("OUPUT:");
System.out.println("YES");
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
else
{
System.out.println("NO");
}
}
}
