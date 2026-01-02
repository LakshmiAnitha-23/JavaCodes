import java.util.*;
import java.util.stream.*;

public class TerminalOperatorExample
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Anitha","Ashok","Asha", "Deepak", "Anand");

        long count = names.stream()
                .filter(name -> name.startsWith("A"))
                .peek(System.out::println)
                .count();

        System.out.println("Names starting with 'A': " +count);
    }
}