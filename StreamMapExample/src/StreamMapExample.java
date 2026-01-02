import java.util.*;
import java.util.stream.*;

public class StreamMapExample
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("anitha", "babu", "cherry");
        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperNames);
    }

}