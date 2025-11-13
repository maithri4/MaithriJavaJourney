 class Maithri
{
public void print()
{
for(int i=0;i<=10;i++)
{
System.out.println(i);
}
}
}
class Thread1 extends Thread
{
Maithri m;
Thread1(Maithri m)
{
this.m=m;
}
public void run()
{
m.print();
}
}
class Thread2 extends Thread
{
Maithri m;
Thread2(Maithri m)
{
this.m=m;
}
public void run()
{
m.print();
}
}
class Synchronization 
{
public static void main(String args[])
{
Maithri m1=new Maithri();
Thread1 t1=new Thread1(m1);
Thread2 t2=new Thread2(m1);
t1.start();
t2.start();
}
}