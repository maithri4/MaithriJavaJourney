 class Maithri extends Thread
{
public void run()
{
for(int i=0;i<=10;i++)
{
System.out.println(i);
}
}
}
class SynchronizedThread
{
public static void main(String args[])
{
Maithri m=new Maithri();
Thread t1=new Thread(m);
Thread t2=new Thread(m);
Thread t3=new Thread(m);
Thread t4=new Thread(m);
t1.start();
t2.start();
t3.start();
t4.start();
}
}