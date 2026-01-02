import java.util.*;
import java.util.stream.*;

public class StreamAPIFiltering

{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(10,20,25,30,35);

        List<Integer> result = numbers.stream()
                .filter(n -> n>20)
                .collect(Collectors.toList());

        System.out.println(result);



    }

}