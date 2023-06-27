public class NestedTry {
    public static void main(String[] args) {
        try {
           // outer try block
           int[] arr = {1, 2, 3};
           int n = Integer.parseInt(args[0]);
           System.out.println(arr[n]); // This will throw an ArrayIndexOutOfBoundsException
           try {
              // inner try block
              int a = 0;
              int b = 5/a; // This will throw an ArithmeticException
           } catch (ArithmeticException e) {
              System.out.println("Arithmetic Exception occurred");
           }
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Array Index Out Of Bounds Exception occurred");
        }
     }
}
