public class PositivenegativeSum{    public static double[] PositivenegativeSum(int arr[])        for(int i=0; i<arr.length; i++){

    for(int i=0; i<arr.length; i++){
        for(int j= i+1; j<arr.length; j++){
          if(arr[i] + arr[j] == 0){
            return new double[]{arr[i] , arr[j]};
          }
        }
      }
      return null;
    }
    public static void main(String args[]){
      int arr[] = {-1,2,-2,3,4,5};
      
      double[] result = PositivenegativeSum(arr);
      if(result != null){
        System.out.println("pair found:" + result[0] + "," + result[1]);
      }else{
        System.out.println("No pair found whose sum is 0.");
      }
      
      double target = 0.00005;
      double epsilon = 0.0001;
      if (Math.abs(target) < epsilon) {
      System.out.println("Target is close to 0");
  } else {
      System.out.println("Target is not close to 0");
  }
  
    }
  }
