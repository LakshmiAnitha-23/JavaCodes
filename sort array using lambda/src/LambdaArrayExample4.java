import java.util.Arrays;

public class LambdaArrayExample4 {
    public static void main(String[] args) {
        String[] names = {"john", "Anitha", "Bob", "Catherine"};


        Arrays.sort(names, (a, b) -> a.length() - b.length());

        Arrays.asList(names).forEach(n -> System.out.println(n));

    }
}