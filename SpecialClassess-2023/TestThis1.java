class A
{  

void m()
{
  System.out.println("Hello m");
}  
void n()
{
System.out.println("Hello n");
m();
}  
}  
class TestThis1{  
public static void main(String mai[ ])
{  
ThisMethod t=new ThisMethod();
t.n();
}
}  