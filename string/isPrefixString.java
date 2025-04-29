import java.util.*;
public class isPrefixString{
    public static  boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
   for(String word : words){
     sb.append(word);//jodte jao
     
     if(sb.length() == s.length()){
       return sb.toString().equals(s);//exact match check
     }
     if(sb.length()>s.length()){
       return false;
     }
   }
   return false;
}
    public static void main(String args[]){
        String s =  "iloveleetcode";
        String words[] = {"i","love","leetcode","apple"};
        System.out.println(isPrefixString(s,words));
    }
}