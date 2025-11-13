public class SynchronizedExample implements Runnable
{
    private int count;
    public synchronized void run()
    {
        for(int i=1;i<=1000;i++)
        {
            count++;
        }
    }
public static void main(String[] args) 
{
    SynchronizedExample obj = new SynchronizedExample();
    Thread t1=new Thread(obj);
    Thread t2=new Thread(obj);
    t1.start();
    t2.start();
    try{
       t1.join();
        t2.join();
    }
    catch(InterruptedException e)
    {
        e.printStackTrace();
    }
   System.out.println(obj.count); 
}

}
