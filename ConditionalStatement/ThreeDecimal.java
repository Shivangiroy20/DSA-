import java.util.Scanner;

public class ThreeDecimal{
    public static void main(String args[]){
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter fisrt number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        num1 = Math.round(num1 * 1000)/ 1000.0;
        num2 = Math.round( num2 * 1000)/ 1000.0;

        if(num1 == num2){
            System.out.println("the number are the same up to three decimal places.");
        }else{
            System.out.println("the number are different.");
        }scanner.close();
    }
}