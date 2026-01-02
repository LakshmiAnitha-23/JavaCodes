import java.util.Arrays;


public class LambdaArrayExample1
{
    public static void main(String[] args)
    {
        Integer[] numbers = {10,20,30,40,50};

        Arrays.asList(numbers).forEach(n -> System.out.println(n));
    }
}