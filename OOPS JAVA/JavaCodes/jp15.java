
//Question 16
/*Write a program to come out of switch block , after executing task
*/
//import java.lang.*;

class Demo {
  public static void main(String args[]) {
    char color = 'g';
    switch (color) {
      case 'r':
        System.out.println("Red");
        break;
      case 'g':
        System.out.println("Greeen");
        break;
      case 'b':
        System.out.println("Blue");
        break;
      case 'w':
        System.out.println("white");
        break;
      default:
        System.out.println("No Color");

    }
  }
}
