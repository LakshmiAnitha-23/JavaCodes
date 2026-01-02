import java.util.*;
import java.util.stream.*;

public class StatelessExample
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Ram", "Anitha", "Ravi","Asha");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .filter(n -> n.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(upperNames);

    }
}