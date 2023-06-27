public class MulException {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = num1/num2;
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (NumberFormatException e) {
            System.out.println("Error: Number format exception");
        } catch (ArithmeticException e) {
            System.out.println("Error: Divide by zero");
        }
    }
}
