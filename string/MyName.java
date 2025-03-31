package string;

public class MyName{
  public static void printName(String str){
    for(int i =0; i<str.length(); i++){
      System.out.print(str.charAt(i) + " ");
    }
    System.out.println();
  }
  public static void main(String args[]){
    String firstname = "Shivangi";
    String Lastname = "roy";
    String fullname = firstname + " " + Lastname;
    printName(fullname);
  }
}