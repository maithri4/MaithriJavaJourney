class FinalKeyword
{
final int speedLimit=90;
void run()
{
speedLimit=400;
System.out.println(speedLimit);
}
public static void main(String args[])
{
FinalKeyword b=new FinalKeyword();
b.run();
}
}