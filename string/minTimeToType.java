public class minTimeToType{
    public static int minTimeToType(String word) {
        int time = 0;
        char curr = 'a';

        for(char c : word.toCharArray()){
            int diff = Math.abs(curr - c);
            time  += Math.min(diff, 26- diff)+1;
            curr = c;
        }
        return time;
    }
    
        public static void main(String args[]){
            String word = "abc";
            System.out.println(minTimeToType(word));
    }
}