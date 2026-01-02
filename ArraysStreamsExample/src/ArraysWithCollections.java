import java.util.*;
import java.util.stream.*;

public class ArraysWithCollections
{
   public static void main(String[] args)
   {
       Integer[] numbers = {5,2,8,3,1,9};

       List<Integer> numList = Arrays.asList(numbers);
       System.out.println("List: " + numList);

       Arrays.sort(numbers);
       System.out.println("sorted array: " + Arrays.toString(numbers));

       Integer[] bigArr = {10,20,5,15};
       Arrays.parallelSort(bigArr);
       System.out.println("Parallel sorted: " + Arrays.toString(bigArr));

       int idx = Arrays.binarySearch(numbers, 5);
       System.out.println("Index of 5: " + idx);

      Integer[] copy = Arrays.copyOf(numbers, numbers.length);
      Integer[] rangeCopy = Arrays.copyOfRange(numbers,1,4);
      System.out.println("copy: " + Arrays.toString(copy));
      System.out.println("Range copy: " + Arrays.toString(rangeCopy));

      Integer[] arr1 = {1,2,3};
      Integer[] arr2 = {1,2,3};
      System.out.println("Arrays equal: " + Arrays.equals(arr1, arr2));

      Integer[] filled = new Integer[5];
      Arrays.fill(filled, 10);
      System.out.println("Filled Array: " + Arrays.toString(filled));

      List<Integer> evenNums = Arrays.stream(numbers)
              .filter(n -> n%2==0)
              .collect(Collectors.toList());
      System.out.println("Even numbers (via stream): " + evenNums);

      System.out.println("Array as String: " + Arrays.toString(numbers));

      Integer[][] matrix = {{1,2}, {3,4}};
      System.out.println("Deep String: " + Arrays.deepToString(matrix));
   }
}