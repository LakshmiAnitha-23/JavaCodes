import java.util.*;
import java.util.stream.*;

public class WrapperExample
{
    public static void main(String[] args)
    {
        IntStream intStream = IntStream.of(1,2,3,4);

        List<Integer> list = intStream
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}