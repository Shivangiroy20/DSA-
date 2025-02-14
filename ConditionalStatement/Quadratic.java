public class Quadratic{
    public static void main(String Strings[]){
      int a = 1;
      int b = 5; 
      int c = 1;
      double discriminant = b * b - 4 * a * c;
      
      if(discriminant > 0){
        Double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        Double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        System.out.println("Roots are real and different:");
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
      }else if(discriminant == 0){
        double root = -b/(2.0 * a);
        System.out.println("Roots are real and same:");
        System.out.println("Root: " + root);
      }else{
        double realPart = -b/(2.0 * a);
        double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
        System.out.println("Roots are complex and different:");
        System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
    }
  }
  }