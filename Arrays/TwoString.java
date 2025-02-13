public class TwoString{
    public static String CommonString(String String1[], String String2[]){
        for(int i =0; i<String1.length; i++){
            for(int j=0; j<String2.length; j++){
                if(String1[i] == String2[j]){
                    return String1[i];
                }
            }
        }
        return null;
    }

    public  static void main(String args[]){
        String[] String1 = {"A", "B" ,"C", "D"};
        String[] String2 = {"A", "D", "E","G"};
        System.out.println("The common String are : " +CommonString(String1,String2));
    }
}