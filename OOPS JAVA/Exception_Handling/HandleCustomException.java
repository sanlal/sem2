class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}


public class HandleCustomException {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            if(num < 0) {
                throw new MyException("Number should be positive");
            }
            System.out.println(num);
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
