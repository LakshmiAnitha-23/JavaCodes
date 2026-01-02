import java.util.Arrays;

public class LambdaArrayExample3
{
    public static void main(String[] args)
    {
        Integer[] numbers = {1,2,3,4,5,6};

        Arrays.stream(numbers)
                .filter(n -> n%2 == 0)
                .forEach(n -> System.out.println(n));
    }
}