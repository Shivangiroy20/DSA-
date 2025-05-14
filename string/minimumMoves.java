public class minimumMoves{
    public static int minimumMoves(String s){
        int i =0, moves = 0;
        while(i < s.length()){
            if(s.charAt(i) == 'X'){
                moves++;
                i +=3;

            }else{
                i++;
            }
        }
        return moves;
    }

    public static void main(String args[]){
        String s = "XXX";
        System.out.println(minimumMoves(s));
    }
}