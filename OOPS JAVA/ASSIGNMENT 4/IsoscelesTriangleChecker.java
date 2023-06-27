import java.util.Scanner;

public class IsoscelesTriangleChecker {

    public static void main(String[] args) {
        try (// Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in)) {
          // Read the length of the three sides of the triangle
          System.out.print("Enter the length of side 1: ");
          double side1 = scanner.nextDouble();
          
          System.out.print("Enter the length of side 2: ");
          double side2 = scanner.nextDouble();
          
          System.out.print("Enter the length of side 3: ");
          double side3 = scanner.nextDouble();
          
          // Check if the triangle is isosceles
          if (side1 == side2 || side1 == side3 || side2 == side3) {
              System.out.println("The triangle is isosceles.");
          } else {
              System.out.println("The triangle is not isosceles.");
          }
        }
    }
}
