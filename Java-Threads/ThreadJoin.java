class Thread1 extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println(i);
}
}
}
class ThreadJoin 
{
public static void main(String args[])
{
Thread1 t1=new Thread1();
Thread1 t2=new Thread1();
t1.start();
t2.start();
}
}