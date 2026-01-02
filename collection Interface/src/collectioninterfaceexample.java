import java.util.*;
public class collectioninterfaceexample {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("python");
        names.add("java");
        names.add("c");
        names.add("Datastructures");
        names.add("Web");
        names.remove("c");


        System.out.println("size of collection: " + names.size());


        List<String> listNames = new ArrayList<>();
        listNames.add("java");
        listNames.add("c");
        listNames.remove("java");
        listNames.add("java");
        listNames.add("web");

        System.out.println("List Elements: " + listNames);

        Set<String> setNames = new HashSet<>();
        setNames.add("Java");
        setNames.add("python");
        setNames.add("c");
        setNames.add("Java");
        System.out.println("set elements (no duplicates): " + setNames);

        Queue<String> queueNames = new LinkedList<>();
        queueNames.add("First");
        queueNames.add("second");
        queueNames.add("Third");
        System.out.println("queue elements: " + queueNames);
    }
}