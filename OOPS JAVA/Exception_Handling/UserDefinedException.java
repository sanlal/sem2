class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}



public class UserDefinedException {
    public static int add(int x, int y) throws NegativeNumberException {
        if (x < 0 || y < 0) {
            throw new NegativeNumberException("Negative numbers not allowed");
        }
        return x + y;
    }

    public static void main(String[] args) {
        try {
            int result = add(2, -5);
            System.out.println("Result: " + result);
        } catch (NegativeNumberException e) {
            System.out.println("Caught exception: " + e);
        }
    }
}
