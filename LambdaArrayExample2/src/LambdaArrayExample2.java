import java.util.Arrays;

public class LambdaArrayExample2
{
    public static void main(String[] args)
    {
        Integer[] numbers = {1,2,3,4,5};
        Arrays.stream(numbers)
                .map(n ->n*2)
                .forEach(n -> System.out.println(n));
    }
}