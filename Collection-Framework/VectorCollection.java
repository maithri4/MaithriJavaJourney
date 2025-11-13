import java.util.*;
class VectorCollection
{
public static void main(String args[])
{
Vector v=new Vector();
v.addElement("cbn");
v.addElement(88);
v.addElement(null);
v.addElement("cbn");
v.addElement("Apple");
System.out.println(v);
v.removeElement(1);
System.out.println(v);
v.removeElement(4);
System.out.println(v);
v.clear();
System.out.println(v);
}
}