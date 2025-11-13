class ObjectCounter
{  
static int count=0;
  
ObjectCounter()
{  
count++; 
}  
static void add()
{
System.out.println(count);  
} 
public static void main(String args[])
{   
ObjectCounter c1=new ObjectCounter();  
ObjectCounter c2=new ObjectCounter();  
ObjectCounter c3=new ObjectCounter();  
ObjectCounter c4=new ObjectCounter();  
ObjectCounter c5=new ObjectCounter();  
ObjectCounter.add();
}  
}  