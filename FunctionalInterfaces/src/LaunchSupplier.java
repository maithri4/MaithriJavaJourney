import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Supplier;

public class LaunchSupplier
{
    public static void main(String[] args)
    {

        Supplier<LinkedHashMap<String, String>> supplier = new Supplier<>()
        {
            @Override
            public LinkedHashMap<String, String> get() {
                return new LinkedHashMap<>();
            }
        };
        
        System.out.println(supplier.get());
    }
}
