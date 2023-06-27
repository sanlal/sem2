
//Question 15
/*Write a program for using switch statement to execute a particular task
depending on color value
*/
//import java.lang.*;

class Demo {
  public static void main(String args[]) {
    char color = 'g';
    switch (color) {
      case 'r':
        System.out.println("Red");
      case 'g':
        System.out.println("Greeen");
      case 'b':
        System.out.println("Blue");
      case 'w':
        System.out.println("white");
      default:
        System.out.println("No Color");

    }
  }
}
