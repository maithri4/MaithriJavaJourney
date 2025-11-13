
class MyThread implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+" priority: "+Thread.currentThread().getPriority());
    }
}

public class ThreadDemo
{
    public static void main(String[] args)
    {

        MyThread t=new MyThread();
        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3 =new Thread(t);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t3.setName("Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
