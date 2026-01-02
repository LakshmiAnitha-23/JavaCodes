import java.util.*;
import java.util.stream.*;

public class StringWithCollections
{
    public static void main(String[] args)
    {
        String sentence = "Java is powerful and programming language";

        String[] wordsArray = sentence.split(" ");
        List<String> wordsList = Arrays.asList(wordsArray);
        System.out.println("Words List: " + wordsList);

        List<String> upperWords = wordsList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase words: " + upperWords);

        List<String> startsWithA = wordsList.stream()
                .filter(w -> w.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("words starting with 'a': " + startsWithA);

       List<String> containsIng = wordsList.stream()
               .filter(w -> w.contains("ing"))
               .collect(Collectors.toList());
       System.out.println("words containing 'ing': " + containsIng);

       Map<String, Integer> wordLengths = wordsList.stream()
               .collect(Collectors.toMap(
                       word -> word,
                       String::length));
       System.out.println("word lengths map: " + wordLengths);

       String word = "collection";
       System.out.println("First char: " +word.charAt(0));
       System.out.println("Index of 'e': " + word.indexOf('e'));
       System.out.println("Substring(3,8): " + word.substring(3,8));

       String joinedSentence = String.join(" ", wordsList);
       System.out.println("Joined back sentence: " + joinedSentence);

       List<String> replacedWords = wordsList.stream()
               .map(w -> w.replace("a", "@"))
               .collect(Collectors.toList());
       System.out.println("Replaced words: " + replacedWords);
    }
}