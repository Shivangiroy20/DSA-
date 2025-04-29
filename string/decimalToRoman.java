public class decimalToRoman{
    public static String decimalToRoman(int num){
    if(num < 1|| num >3999){
        return "Number out of range(1-3999)";
    }
    String[] thousands = {"", "M" , "MM", "MMM"};
    String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] tens = {"", "X", "XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    String[] Ones= {"", "I", "II" ,"III" ,"IV", "V", "VI"};

    return thousands[num/1000]+
    hundreds[(num %100)/100]+
    tens[(num % 100)/10]+
    Ones[num % 10];
}
    public static void main(String args[]){
        int num = 2004;
        System.out.println("Roman numeral of" + num + "is" + decimalToRoman(num));
    }
}