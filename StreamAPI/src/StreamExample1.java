import java.util.*;
import java.util.stream.*;

public class StreamExample1
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.stream()
                .forEach(n -> System.out.println(n));
    }
}