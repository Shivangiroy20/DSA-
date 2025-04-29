package Recursion;

public class PrintN{
    public static void PrintN(int n){
        if(n > 0){
            PrintN(n - 1);
            System.out.print(n + " ");
        }
    }
    public static void main(String args[]){
        int n = 10;
        PrintN(n);
    }
}