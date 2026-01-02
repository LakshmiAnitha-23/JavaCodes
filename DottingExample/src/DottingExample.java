import java.util.*;
import java.util.stream.*;

public class DottingExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(5,12,9,21,8);

        List<Integer> result = numbers.stream()
                .filter(n-> n>10)
                .map(n -> n*2)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);

    }
}