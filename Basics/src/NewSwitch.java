public class NewSwitch
{
    public static void main(String[] args)
    {
        var time = "";
        String day = "Tue";
        time = switch (day)
        {
            case "Sun", "Sat" -> "8am";

            default -> "6am";
        };
        System.out.println(time);
    }
}
