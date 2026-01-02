import java.util.*;
import java.util.stream.*;

public class StreamCombinedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anitha", "Ram", "Anusha");

        List<String> result = names.stream()
                .filter(n -> n.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
