import java.util.*;
import java.util.stream.*;

public class StatefulExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(5,3,2,1,4,2,2);
        List<Integer> result = numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}