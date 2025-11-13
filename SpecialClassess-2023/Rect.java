class Rectangle
{
int length;
int breadth;
void calculate(int i,int j)
{
length=i;
breadth=j;
}
void disp()
{
System.out.println(length*breadth);
}
void peri(int r)
{
System.out.println(2*3.14*r);
}
}
class Rect
{
public static void main(String args[])
{
Rectangle r=new Rectangle();
r.calculate(4,8);
r.disp();
r.peri(2);
}
}