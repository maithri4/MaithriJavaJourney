class Join extends Thread
{
public void run()  //run method
{
for(int i=0;i<=5;i++)
{
System.out.println(i);
}
}
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
t2.start();
}
}