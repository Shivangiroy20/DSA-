public class countTriangle{
    public static int countTriange(int arr[]){
        int n = arr.length; 
        int count = 0;
        for(int i=0; i<n-2;i++){
          for(int j=i+1; j<n-1;j++){
            for(int k= j+1; k<n; k++){
              if(arr[i] + arr[j] >arr[k] && 
              arr[i] + arr[k] > arr[j] &&
              arr[j] + arr[k] > arr[i]){
                count++;
              }
            }
          }
        }
        return count;
      }
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,8,9};
        System.out.println("Number of triangles: " + countTriange(arr));
    }
}