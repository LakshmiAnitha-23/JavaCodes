import java.util.*;
import java.util.stream.*;

public class StringArrayCollectionDemo
{
    public static void main(String[] args)
    {
        System.out.println("string methods with collection framework");
        String sentence = "java is a popular and powerful programming language";

        String[] wordsArray = sentence.split(" ");
        System.out.println("Split into Array: " + Arrays.toString(wordsArray));

        List<String> wordList = Arrays.asList(wordsArray);
        System.out.println("converted to List: " + wordList);

        List<String> upperWords = wordList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase Words: " + upperWords);

        List<String> startsWithp = wordList.stream()
                .filter(w -> w.startsWith("p"))
                .collect(Collectors.toList());
        System.out.println("words sarting with 'p': " + startsWithp);

        List<String> containsIng = wordList.stream()
                .filter(w -> w.contains("ing"))
                .collect(Collectors.toList());
        System.out.println("words containing 'ing': " + containsIng);

        Map<String, Integer> wordLengthMap = wordList.stream()
                .collect(Collectors.toMap(w-> w, w-> w.length(), (a,b) -> a));
        System.out.println("Words containing 'ing': " + containsIng);

        List<String> replacedWords = wordList.stream()
                .map(w-> w.replace("a", "@"))
                .collect(Collectors.toList());
        System.out.println("words after replace('a', '@'): " + replacedWords);

        String joinedSentence = String.join(" ", wordList);
        System.out.println("Joined Sentence: " + joinedSentence);

        String example = "Collection";
        System.out.println("Substring(3,8): " + example.substring(3,8));
        System.out.println("character atindex 2: " + example.charAt(2));

        System.out.println("\"Java\" equalsIgnoreCase \"java\" ? " + "Java".equalsIgnoreCase("java"));
        System.out.println("\"Apple\" compareTo \"Banana\" = " + "Apple".compareTo("Banana"));


        System.out.println("\n Array Methods With Collection Framework");

        Integer[] numbers = {5,2,8,3,1,9};

        Arrays.sort(numbers);
        System.out.println("sorted Array: " + Arrays.toString(numbers));

        Integer[] nums2 = {10,40,20,30};
        Arrays.parallelSort(nums2);
        System.out.println("parallel sorted Array: " + Arrays.toString(nums2));

        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("Binary search for 5: Index " + index);

        Integer[] copy = Arrays.copyOf(numbers, numbers.length);
        Integer[] rangeCopy = Arrays.copyOfRange(numbers,2,5);
        System.out.println("Copy of array: " + Arrays.toString(copy));
        System.out.println("Range copy (2-5): " + Arrays.toString(rangeCopy));

        Integer[] arr1 = {1,2,3};
        Integer[] arr2 = {1,2,3};
        System.out.println("Arrays equal: " + Arrays.equals(arr1, arr2));
        Integer[] filled = new Integer[5];
        Arrays.fill(filled, 10);
        System.out.println("Filled Array: " + Arrays.toString(filled));

        List<Integer> evenNumbers = Arrays.stream(numbers)
                .filter(n -> n%2 ==0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers (Stream): " + evenNumbers);

        Integer[][] matrix = {{1,2}, {3,4}};
        System.out.println("2D Array DeepToString: " + Arrays.deepToString(matrix));

        Integer[] arrA = {1,2,3};
        Integer[] arrB = {1,2,4};
        System.out.println("Arrays.compare(): " + Arrays.compare(arrA, arrB));
        System.out.println("Arrays.mismatch(): " + Arrays.mismatch(arrA, arrB));

        System.out.println("Array HashCode: " + Arrays.hashCode(numbers));

        System.out.println("\n STRING + ARRAY + COLLECTION INTEGRATION");

        String text = "apple banana apple mango banana";
        List<String> fruitsList = Arrays.asList(text.split(" "));
        Set<String> uniqueFruits = new HashSet<>(fruitsList);
        System.out.println("Unique Fruits (Set): " + uniqueFruits);

        List<Integer> numList = new ArrayList<>(Arrays.asList(numbers));
        Collections.sort(numList);
        System.out.println("sorted list using collections.sort(): " + numList);

        List<String> sortedDistinctWords = Arrays.stream(wordsArray)
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Distinct Sorted words: " + sortedDistinctWords);


    }
}