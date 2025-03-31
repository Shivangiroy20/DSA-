package string;

public class ReverseString{
  public static String reverseString( String str){
    StringBuilder res = new StringBuilder();
    for(int i=str.length()-1; i>= 0; i--){
      res.append(str.charAt(i));
      
    }
    return res.toString();
  }
  public static void main(String args[]){
    String str = "GeekforGeeks";
    String res = reverseString(str);
    System.out.print(res);
  }
}