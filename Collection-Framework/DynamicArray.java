import java.util.ArrayList;
import java.util.List;

public class DynamicArray 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al=new ArrayList();
        al.add(20);
        al.add(54);
        al.add(1,33);
        Integer ia[]=new Integer[al.size()];
        ia = al.toArray(ia);
        int sum=0;
        for(int i:ia)
        {
            sum+=i;
        }
        System.out.println("Sum of elements in the list:"+sum);   
    }
    
}
