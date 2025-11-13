import java.util.ArrayList;
import java.util.HashSet;
public class RemovingDuplicatesFromArrayList 
{
public static void main(String[] args) 
  {
    ArrayList<Integer> al=new ArrayList<>();
    al.add(2);
    al.add(5);
    al.add(2);
    al.add(10);
    al.add(1);
    al.add(10);
    al.add(8);
    System.out.println("Before Removing Duplicates: "+al);
    HashSet<Integer> h=new HashSet<>(al);
    al.clear();
    al.addAll(h);
    System.out.println("After Removing Duplicates: "+al);
  }   
}
