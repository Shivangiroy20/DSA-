public class countPrefix{
    public static int countPrefix(String s, String[]words){
        int count = 0;
        for(String word : words){
            if(s.startsWith(word)){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        String s = "abc";
        String words[] = {"a","b","c","ab","bc","abc"};
        System.out.println(countPrefix(s,words));

    }
}