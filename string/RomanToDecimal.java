
public class RomanToDecimal{
    public static int value(char c){
        if( c == 'I')
        return 1;
        if( c == 'V')
        return 5;
        if( c == 'X')
        return 10;
        if( c == 'L')
        return 50;
        if( c == 'C')
        return 100;
        if(c == 'D')
        return 500;
        if( c == 'M')
        return 1000;
        return -1;
    }

    public static int romanToDecimal(String s){
        int res = 0;

        for(int i=0; i<s.length(); i++){
            int s1 = value(s.charAt(i));

            if(i + 1< s.length()){
                int s2 = value(s.charAt(i+1));

                if(s1>= s2){
                    res += s1;
                }else{
                    res += (s2 - s1);
                    i++;
                }
            }else{
                res += s1;
            }
        }
        return res;
    }
    public static void main(String args[]){
        String s = "MCMCIV";
        System.out.println(romanToDecimal(s));
        
    }
}