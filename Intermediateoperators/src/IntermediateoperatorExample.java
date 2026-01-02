import java.util.*;
import java.util.stream.*;

public class IntermediateoperatorExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        Stream<Integer> resultStream = numbers.stream()
                .filter(n -> n%2==0)
                .map(n -> n*n)
                .sorted()
                .peek(System.out::println);

        System.out.println("stream defined but not executed yet");
        resultStream.collect(Collectors.toList());
    }
}