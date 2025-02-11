public class MaXimumFrequency{
    public static int MaxFrequency(int arr[] , int x, int y){
      int cntx = 0;
      int cnty = 0;
      // count occurance of x and y int the araay
      for(int ele: arr){
        if(ele == x){
          cntx++;
        }
        else if(ele == y){
          cnty++;
        }
        }
         if(cntx ==  cnty){
        return Math.min(x, y);
      
     
      }
      return cntx > cnty ? x:y;
    }
  
    public static void main(String args[]){
      int x = 4; 
       int y = 5;
        int arr[] = {1,1,2,2,3,3,4,4,4,4,5};
        System.out.println("MaxFrequency : " + MaxFrequency(arr, x, y));
    }
  }