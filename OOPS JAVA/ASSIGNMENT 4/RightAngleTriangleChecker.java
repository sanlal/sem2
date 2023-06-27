import java.util.Scanner;

public class RightAngleTriangleChecker {

    public static void main(String[] args) {
        try (// Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in)) {
          // Read the angle of the three sides of the triangle
          System.out.print("Enter the angle of side 1: ");
          double side1 = scanner.nextDouble();
          
          System.out.print("Enter the angle of side 2: ");
          double side2 = scanner.nextDouble();
          
          System.out.print("Enter the angle of side 3: ");
          double side3 = scanner.nextDouble();
          
          // Check if the triangle is right angled
          if((side1+side2+side3)==180){
            if(side1==90 || side2==90 || side3==90){
                if (side1 == side2 || side2 == side3 || side1 == side3) {
                    System.out.println("The triangle is Right Angled.");
                } else {
                    System.out.println("The triangle is not Right Angled.");
                }
              }
          }
          else {
            System.out.println("Entered wrong angles!!!");
          }
        }
    }
}
