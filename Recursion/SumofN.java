package Recursion;

public class SumofN{
    public static int recurSum(int n){
        if(n <= 1)
        return n;
        return n + recurSum(n-1);
        
    }
    public static void main(String arg[]){
        int n = 10;
        System.out.println("The Value is ::" + recurSum(n));
    }
}