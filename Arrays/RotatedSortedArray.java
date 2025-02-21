public class RotatedSortedArray{
        public static boolean RotatedSortedArray(int arr[], int n, int x){
          int pivot = -1;
          for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
              pivot = i;
              break;
            }
          }
          
          if(pivot == -1){
            pivot = n-1;
          }
          int left = (pivot + 1) % n;
          int right = pivot;
          
          while(left != right){
            int sum = arr[left] + arr[right];
            
            if(sum == x)
            return true;
            
            else if(sum < x)
            left = (left + 1) % n;
            
            else 
            right = (right - 1 + n)% n;
          }
          return false;
        }
        public static void main(String args[]){
          int arr[] = {3,5,6,7,9};
          int sum = 12;
          int n = arr.length;
          if(RotatedSortedArray(arr, n, sum))
          System.out.println("Array having element whose sum 12");
          else 
          System.out.println("Array having no pair whose sum is 12");
        }
      }
