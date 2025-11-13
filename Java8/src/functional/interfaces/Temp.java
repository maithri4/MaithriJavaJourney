package functional.interfaces;

public class Temp
{
    public static void main(String[] args)
    {
        var s = "00|354|000|434|0|89|00";
        System.out.println(s.replaceFirst("0+$", ""));
    }
}
