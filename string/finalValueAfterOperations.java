public class finalValueAfterOperations{
    public static int finalValueAfterOperations(String[] operations){
        int x=0;
        for(String op : operations){
            if(op.contains("++")){
                x++;
            }else{
                x--;
            }

        }
        return x;
    }
    public static void main(String args[]){
        String[] operations = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operations));
        
    }
}