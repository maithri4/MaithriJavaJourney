public class DefaultValues 
{
    int a;
    double d;
    float c;
    String s;
    char ch;
    boolean bool;
    static
    {
        System.out.println("Staic Block Will be executed first..!! Before executing main method.");
    }
    public static void main(String[] args) 
    {
        DefaultValues obj=new DefaultValues();
        System.out.println("Default Value of Ingteger: "+obj.a);
        System.out.println("Default Value of Double: "+obj.d);
        System.out.println("Default Value of Float: "+obj.c);
        System.out.println("Default Value of String: "+obj.s);
        System.out.println("Default Value of Character: '"+obj.ch+"'");
        System.out.println("default Value of Boolean: "+obj.bool);
    }
}