import java.util.*;

public class RemoveDuplicate {
  public static int[] RemoveDuplicate(int arr[]) {
    Set<Integer> uniqueElements = new LinkedHashSet<>();  // Use LinkedHashSet to preserve insertion order
    
    for (int i = 0; i < arr.length; i++) {
      uniqueElements.add(arr[i]);
    }
    
    int[] newArr = new int[uniqueElements.size()];
    int index = 0;
    for (int element : uniqueElements) {
      newArr[index++] = element;
    }
    return newArr;
  }

  public static void main(String args[]) {
    int arr[] = {2, 2, 3, 4, 5, 6, 2, 3, 7, 7};  // Declare the original array
    
    int[] newArr = RemoveDuplicate(arr);  // Get the new array with duplicates removed
    
    System.out.println("The new array is:");
    for (int num : newArr) {
      System.out.print(num + " ");
    }
  }
}