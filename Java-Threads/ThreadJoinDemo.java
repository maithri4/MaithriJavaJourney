class MyThread extends Thread
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println(i);
}
}
}
class ThreadJoinDemo
{
public static void main(String args[])
{
MyThread t1=new MyThread();
MyThread t2=new MyThread();
t1.start();
try
{
t1.join();
}
catch(Exception e)
{
}
t2.start();
}
}