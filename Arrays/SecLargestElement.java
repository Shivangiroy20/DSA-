public class SecLargestElement {
    public static int SecLargestElement(int arr[]) {
      // Ensure the array has at least two elements
      if (arr.length < 2) {
        return -1;  // Return -1 if no second largest element
      }
  
      int firstLargest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;
  
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > firstLargest) {
          secondLargest = firstLargest;
          firstLargest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
          secondLargest = arr[i];
        }
      }
      
      return secondLargest;
    }
  
    public static void main(String args[]) {
      int arr[] = {2, 5, 7, 4, 8, 9};
      int result = SecLargestElement(arr);
      
      if (result == -1) {
        System.out.println("There is no second largest element.");
      } else {
        System.out.println("The second largest element is: " + result);
      }
    }
  }
  