import java.util.*;
import java.util.stream.*;

public class StreamSortExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(5,1,4,2,3);

        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

                System.out.println(sorted);

    }
}