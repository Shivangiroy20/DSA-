import java.util.*;
public class antiDiagonals{
  public static List<List<Integer>>getAntiDiagonals(int[][]matrix){
    int n = matrix.length;
    List<List<Integer>>antiDiagonals = new ArrayList<>();
    
    for(int sum = 0; sum < 2* n-1; sum++){
      List<Integer>diagonal = new ArrayList<>();
      
      for(int i=0; i<n; i++){
        int j = sum - i;
        
        if(j >= 0 && j<n){
          diagonal.add(matrix[i][j]);
        }
      }
      antiDiagonals.add(diagonal);
    }
    return antiDiagonals;
  }
  public static void main(String args[]){
    int [][] matrix = {{1,2},
    {3,4}}; 
    List<List<Integer>> result = getAntiDiagonals(matrix);
    for(List<Integer>diag : result){
      System.out.println(diag);
    }
  }
}