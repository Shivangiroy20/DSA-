public class IsRotation{
    public static boolean IsRotation(String s1, String s2 ){
        if(s1.length() != s2.length());
            String concatenated = s1 + s1; // concatenated means joining of two string
            return concatenated.contains(s2);
        }
    
    public static void main(String args[]){
        String s1 = "aba";
        String s2 = "baa";
        System.out.println(IsRotation(s1, s2));
        
    }
}