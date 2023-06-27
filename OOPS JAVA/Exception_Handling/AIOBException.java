public class AIOBException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int result = arr[3];
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        }
    }
}
