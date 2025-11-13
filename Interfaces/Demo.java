@FunctionalInterface
interface A 
{
    int show(int i,int j);
}
public class Demo 
{
    public static void main(String[] args) 
    {
        A obj = (i,j) -> i+j;

        int res = obj.show(5,10);
        System.out.println(res);

        
    }
    
}
