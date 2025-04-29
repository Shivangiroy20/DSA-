
public class Palindrome{
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length(); i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str1= "racecar";
        String str2="noon";
        String str3="madam";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome(str3));
    }
}