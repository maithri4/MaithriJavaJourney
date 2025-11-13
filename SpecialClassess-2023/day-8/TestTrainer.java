import java.util.Scanner;
class Trainer
{
private int tid;
public void setTid(int tid)
{
this.tid=tid;
}
public int getTid()
{
return this.tid;
}
public Trainer(int tid)
{
this.tid=tid;
}
public Trainer()
{
this.tid=0;
}
}
class TestTrainer
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter teacher ID:");
int tidin=sc.nextInt();
Trainer ob1=new Trainer(tidin);
System.out.println("tid:"+ob1.getTid());
}
}