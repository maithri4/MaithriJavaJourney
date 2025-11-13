class Thread1 extends Thread
{
public void run()  //run method
{
Thread t=currentThread();
System.out.println("Thread status:"+t.isAlive()); // isAlive method.
for(int i=0;i<=5;i++)
{
try
{
Thread.sleep(1000);  //sleep method
}
catch(Exception e)
{
}
System.out.println(i);
}
}
}
class JoinIsAliveMethods 
{
public static void main(String args[])
{
Thread1 t1=new Thread1();
Thread1 t2=new Thread1();
t1.start();  //start method
try
{
t1.join(); //join method
}
catch(Exception e)
{
}
System.out.println("Thread1 status is:"+t1.isAlive());
t2.start();  //start method
System.out.println("Thread2 is  Running:"+t2.isAlive());
}
}