public class ReverseGroupArray{
    public static int ReverseGroupArray(int arr[], int k){
        int n = arr.length;
        for(int i=0; i<n; i+=k){
            int left = i;
            int right = Math.min(i + k -1, n-1);

            while(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 3;

        ReverseGroupArray(arr, k);
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}




// second way


//   public static void reverse(int arr[] , int k){
//     int n = arr.length;
//     int index = -1;
    
//     for(int i=0; i<arr.length; i++){
//       if(arr[i] == k){
//         index = i;
//         break;
//       }
//     }
//     if(index >= 0){
//       int left = 0;
//       int right = index;
      
//       while(left < right){
//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right] = temp;
//         left++;
//         right--;
//       }
//     }
//   }
//   public static void main(String args[]){
//     int arr[] = {1,2,3,4,5,6,7,8,9};
//     int k = 3;
//      reverse(arr, k);
//     System.out.println("Arrays after reversing before k: " + Arrays.toString(arr));
//   }
// }
