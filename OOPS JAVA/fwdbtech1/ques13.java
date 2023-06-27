package b_tech_assignment1;

public class ques13 {
    public void printMessage() {
       System.out.println("Hello, World!");
    }
 
    public void printMessage(String message) {
       System.out.println(message);
    }
 
    public void printMessage(String message, int times) {
       for (int i = 0; i < times; i++) {
          System.out.println(message);
       }
    }
 
    public static void main(String[] args) {
       ques13 myObj = new ques13();
 
       // Call the instance method with no arguments
       myObj.printMessage();
 
       // Call the instance method with one argument
       myObj.printMessage("This is a custom message.");
 
       // Call the instance method with two arguments
       myObj.printMessage("Another message.", 3);
    }
 }
 
