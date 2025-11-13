import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ListMethods 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> al=new ArrayList();
        al.add(20);
        al.add(15);
        al.add(1,33);
        System.out.println(al);
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(5);
        al2.add(10);
        boolean bool = al.addAll(2, al2);
        System.out.println("al2 is added into al at index 2: "+bool);
        System.out.println(al);  
        Collections.sort(al);
        System.out.println("List after sorting: "+al);
        Integer valAtPosition_4 = al.get(4);
        System.out.println("Value at index 4: "+valAtPosition_4);
        System.out.println("updating the value at specific index");
        al.set(1, 55);
        System.out.println("after updation,the list is: "+al);
        Integer removedVal = al.remove(0);
        System.out.println("element al index 0: "+removedVal);

        List<Integer> l = al.subList(1, 4);
        System.out.println("sublist of al: "+l);
    }
}
